document.addEventListener('alpine:init', () => {
    Alpine.data('pessoaModal', () => ({
        modalTitle: 'Nova Pessoa',
        pessoaId: null,
        pessoaName: '',

        // ADD
        openCreate() {
            this.modalTitle = 'Nova Pessoa'
            this.pessoaId = null
            this.pessoaName = ''
        },

        // EDIT
        openEdit(dataset) {
            this.modalTitle = 'Editar Pessoa'
            this.pessoaId = Number(dataset.id)
            this.pessoaName = dataset.name
        },

        // DELETE
        openDelete(dataset) {
            this.pessoaId = Number(dataset.id)
            this.pessoaName = dataset.name
        }

    }))
})

document.body.addEventListener('htmx:afterSwap', function (event) {

    // Fecha modal de ADD / EDIT
    const pessoaModalEl = document.getElementById('pessoaModal')
    if (pessoaModalEl) {
        const modal = bootstrap.Modal.getInstance(pessoaModalEl)
        if (modal) modal.hide()
    }

    // Fecha modal de DELETE
    const deleteModalEl = document.getElementById('deletePessoaModal')
    if (deleteModalEl) {
        const modal = bootstrap.Modal.getInstance(deleteModalEl)
        if (modal) modal.hide()
    }

    // Toast
    const toastElements = document.querySelectorAll('#pessoas-content .toast')
        toastElements.forEach(function (toastEl) {
            // Move para o container fixo
            document.getElementById('toast-container').appendChild(toastEl)
            const toast = new bootstrap.Toast(toastEl)
            toast.show()
        })
})

//setTimeout(() => {
//    const alert = document.querySelector('.alert')
//    if (alert) alert.remove()
//}, 4000)

function showToast() {
    const toastElList = document.querySelectorAll('.toast')
    toastElList.forEach(toastEl => {
        const toast = new bootstrap.Toast(toastEl)
        toast.show()
    })
}
