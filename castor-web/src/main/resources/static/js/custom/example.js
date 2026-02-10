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

setTimeout(() => {
    const alert = document.querySelector('.alert')
    if (alert) alert.remove()
}, 4000)
