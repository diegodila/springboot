package br.com.fiap.convidados.service;
import br.com.fiap.convidados.dto.ConvidadosDto;
import java.util.List;

public interface ConvidadosService {

    ConvidadosDto salvarConvidados(ConvidadosDto convidadoDto);

    List<ConvidadosDto> listarConvidados();

    ConvidadosDto editarConvidados(Long id);

    void excluirConvidados(Long id);
}
