package ir.pegahtech.mediaad.sample.service.impl

import ir.pegahtech.mediaad.sample.dto.DestinationDTO
import ir.pegahtech.mediaad.sample.dto.SourceDTO
import ir.pegahtech.mediaad.sample.service.ConvertService
import ir.pegahtech.mediaad.sample.service.MapStructMapper
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service

@Service
@Mapper
class MapStructConvertService: ConvertService {
//    private var mapper: MapStructMapper = Mappers.getMapper(MapStructMapper::class.java)

    override fun convert(sourceDTO: SourceDTO?): DestinationDTO? {
//        return mapper.sourceToDestinationDto(sourceDTO)
        //TODO
        return null
    }

}