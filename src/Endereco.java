public record Endereco(
    String cep,        // CEP do endereço
    String logradouro, // Nome da rua do endereço
    String localidade, // Localidade do endereço
    String complemento,// Complemento do endereço
    String uf          // Unidade federativa do endereço
) {}
