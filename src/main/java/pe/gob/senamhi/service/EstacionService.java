package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.*;
import pe.gob.senamhi.mapper.EstacionMapperService;
import pe.gob.senamhi.repository.EstacionRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class EstacionService extends EstacionMapperService {

    @Autowired
    private EstacionRepository repository;
    @Autowired
    private DepartamentoService departamentoService;

    @Autowired
    private ProvinciaService provinciaService;

    @Autowired
    private DistritoService distritoService;

    @Autowired
    private CategoriaEstacionService categoriaEstacionService;

    @Autowired
    private TipoEstacionService tipoEstacionService;

    public List<EstacionDto> getAllConvenio() {
        String cod = "230020";
        List<EstacionDto> dto = repository.finByCodConvenio(cod).stream().map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

    public List<EstacionReponseDto> getAllConvenioReponse() {
        String cod = "230020";
        List<EstacionDto> estacionDtoList = repository.finByCodConvenio(cod).stream().map(this::convertToDto)
                .collect(Collectors.toList());

        List<EstacionReponseDto> estacionReponseDtos = new ArrayList<>();

        if (!estacionDtoList.isEmpty()){

            for (EstacionDto estacionDto: estacionDtoList) {
                EstacionReponseDto estacionReponseDto = new EstacionReponseDto();

                DepartamentoDto departamentoDto = new DepartamentoDto();
                departamentoDto = departamentoService.findById(estacionDto.getCodDepartamento());

                ProvinciaDto provinciaDto = new ProvinciaDto();
                provinciaDto = provinciaService.finByCodProvAndCodDep(estacionDto.getCodProvincia(),estacionDto.getCodDepartamento());

                DistritoDto distritoDto = new DistritoDto();
                distritoDto = distritoService.finByConDistAndCodProvAndCodDep(estacionDto.getCodDistrito(),estacionDto.getCodProvincia(),estacionDto.getCodDepartamento());

                CategoriaEstacionDto categoriaEstacionDto = new CategoriaEstacionDto();
                categoriaEstacionDto = categoriaEstacionService.findById(estacionDto.getCodCategoria());

                TipoEstacionDto tipoEstacionDto = new TipoEstacionDto();
                tipoEstacionDto = tipoEstacionService.findById(estacionDto.getCodTipoEstacion());

                //SETEAR VALORES
                estacionReponseDto.setNombreDepartamento(departamentoDto.getNomDepartamento());
                estacionReponseDto.setNombreProvincia(provinciaDto.getNomProvincia());
                estacionReponseDto.setNombreDistrito(distritoDto.getNomDistrito());
                estacionReponseDto.setNombreCategoria(categoriaEstacionDto.getDescripcionCategoriaL());
                estacionReponseDto.setNombreTipoEstacion(tipoEstacionDto.getDescripcionTipo());

                estacionReponseDto.setCodEstacion(estacionDto.getCodEstacion());
                estacionReponseDto.setNombreEstacion(estacionDto.getNombreEstacion());
                estacionReponseDto.setLongitudGrado(estacionDto.getLongitudGrado());
                estacionReponseDto.setLongitudMinuto(estacionDto.getLongitudMinuto());
                estacionReponseDto.setLongitudSegundo(estacionDto.getLongitudSegundo());
                estacionReponseDto.setLongitudSIG(estacionDto.getLongitudSIG());
                estacionReponseDto.setLatitudGrado(estacionDto.getLatitudGrado());
                estacionReponseDto.setLatitudMinuto(estacionDto.getLatitudMinuto());
                estacionReponseDto.setLatitudSegundo(estacionDto.getLatitudSegundo());
                estacionReponseDto.setLatitudSIG(estacionDto.getLatitudSIG());
                estacionReponseDto.setAlturamsnm(estacionDto.getAlturamsnm());
                estacionReponseDto.setCodCondicion(estacionDto.getCodCondicion());
                estacionReponseDto.setCodigoTipoEstacion(estacionDto.getCodigoTipoEstacion());
                estacionReponseDto.setClaseEstacion(estacionDto.getClaseEstacion());
                estacionReponseDtos.add(estacionReponseDto);
            }
        }

        return estacionReponseDtos;
    }

    public List<EstacionDto> getAllConvenioProv(String codDep) {
        String codConvenio = "230020";
        List<EstacionDto> dto = repository.finByCodConvenioAndCodDep(codConvenio,codDep).stream().map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

    public List<EstacionDto> getAllConvenioDist(String codProv, String codDep) {
        String codConvenio = "230020";
        List<EstacionDto> dto = repository.finByCodConvenioAndCodDepAndCodProv(codConvenio,codProv,codDep).stream().map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

    public EstacionDto findById(String codEsta) {
        return repository.findById(codEsta).map(this::convertToDto).orElse(null);
    }

}
