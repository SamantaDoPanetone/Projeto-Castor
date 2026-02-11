package br.com.restaurante.castor.controller;

import br.com.restaurante.castor.dtos.PessoaDTO;
import br.com.restaurante.castor.dtos.PessoaFormDTO;
import br.com.restaurante.castor.facades.ExampleFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collections;
import java.util.List;

@Controller
public class HomeExampleController
{
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeExampleController.class);

    private final ExampleFacade exampleFacade;

    public HomeExampleController(ExampleFacade testFacade)
    {
        this.exampleFacade = testFacade;
    }

    @GetMapping("/page")
    public String page(Model model, RedirectAttributes redirectAttributes)
    {
        LOGGER.info("Chamou page");

        try
        {
            List<PessoaDTO> pessoas = exampleFacade.findAllPessoas();
            model.addAttribute("pessoas", pessoas);
        }
        catch (Exception e)
        {
            redirectAttributes.addFlashAttribute("errorMessage", "Erro ao listar pessoas!");
            model.addAttribute("pessoas", Collections.emptyList());
            LOGGER.error("Erro", e);
        }

        return "example";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute PessoaFormDTO pessoaDTO, Model model) {

        LOGGER.info("Chamou save");
        LOGGER.info(pessoaDTO.toString());

        try
        {
            exampleFacade.save(pessoaDTO);
            model.addAttribute("successMessage", "Pessoa salva com sucesso!");
        }
        catch (Exception e)
        {
            model.addAttribute("errorMessage", "Erro ao salvar/editar pessoa!");
            LOGGER.error("Erro", e);
        }

        model.addAttribute("pessoas", exampleFacade.findAllPessoas());
        return "fragments/pessoas-content :: content";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id, Model model) {

        LOGGER.info("Chamou delete");
        LOGGER.info(String.valueOf(id));

        try
        {
            exampleFacade.delete(id);
            model.addAttribute("successMessage", "Pessoa excluída com sucesso!");
        }
        catch (Exception e)
        {
            model.addAttribute("errorMessage", "Erro ao excluir pessoa!");
            LOGGER.error("Erro", e);
        }

        model.addAttribute("pessoas", exampleFacade.findAllPessoas());
        return "fragments/pessoas-content :: content";
    }

}
