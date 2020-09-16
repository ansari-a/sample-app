package ir.pegahtech.mediaad.sample.service

import ir.pegahtech.mediaad.sample.dto.DestinationDTO
import ir.pegahtech.mediaad.sample.dto.SourceDTO
import org.mapstruct.Mapper
import org.mapstruct.Mapping


@Mapper
interface MapStructMapper {

    @Mapping(source = "numberOfSeats", target = "seatCount")
    fun sourceToDestinationDto(sourceDTO: SourceDTO?): DestinationDTO?
}