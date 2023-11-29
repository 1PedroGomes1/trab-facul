// Formatar os Campos de Telefone e Contato

$(document).ready(function() {
	// Inicialize a máscara para o campo de telefone
	$('.telefone').inputmask('(99) 9999-99999', { clearMaskOnLostFocus: false });

	// Inicialize a máscara para o campo de contato
	$('.contato').inputmask('(99) 9999-99999', { clearMaskOnLostFocus: false });
});

