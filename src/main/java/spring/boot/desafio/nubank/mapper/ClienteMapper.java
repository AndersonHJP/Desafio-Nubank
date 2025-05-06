//package spring.boot.desafio.nubank.mapper;
//
//import spring.boot.desafio.nubank.dto.ClientesResponseDTO;
//import spring.boot.desafio.nubank.dto.ContatoResponseDTO;
//import spring.boot.desafio.nubank.model.Clientes;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class ClienteMapper {
//    public static ClientesResponseDTO toDTO(Clientes cliente) {
//        ClientesResponseDTO dto = new ClientesResponseDTO();
//        dto.setId(cliente.getId());
//        dto.setNome(cliente.getNome());
//
//        List<ContatoResponseDTO> contatos = cliente.getContatos().stream().map(c -> {
//            ContatoResponseDTO contatoDTO = new ContatoResponseDTO();
//            contatoDTO.setId(c.getId());
//            contatoDTO.setTelefone(c.getTelefone());
//            contatoDTO.setEmail(c.getEmail());
//            return contatoDTO;
//        }).collect(Collectors.toList());
//        dto.setContatos(contatos);
//
//        return dto;
//    }
//}
