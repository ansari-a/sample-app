package ir.pegahtech.mediaad.sample.service.impl

import ir.pegahtech.mediaad.sample.dto.DestinationDTO
import ir.pegahtech.mediaad.sample.dto.SourceDTO
import ir.pegahtech.mediaad.sample.service.ConvertService
import org.apache.commons.beanutils.BeanUtils
import org.springframework.stereotype.Service

@Service
class BeanUtilsConvertService: ConvertService {
    override fun convert(sourceDTO: SourceDTO): DestinationDTO {
        val destinationDTO = DestinationDTO()
        BeanUtils.copyProperties(destinationDTO, sourceDTO)
        return destinationDTO
    }
}