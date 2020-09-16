package ir.pegahtech.mediaad.sample.service

import ir.pegahtech.mediaad.sample.dto.DestinationDTO
import ir.pegahtech.mediaad.sample.dto.SourceDTO

interface ConvertService {
    fun convert(sourceDTO: SourceDTO?): DestinationDTO?
}