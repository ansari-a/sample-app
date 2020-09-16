package ir.pegahtech.mediaad.sample

import ir.pegahtech.mediaad.sample.dto.DestinationDTO
import ir.pegahtech.mediaad.sample.dto.SourceDTO
import ir.pegahtech.mediaad.sample.service.ConvertService
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.util.*

@ExtendWith(SpringExtension::class)
@SpringBootTest
class SampleAppApplicationTests{

	@Autowired
	private var beanUtilsConvertService: ConvertService? = null

    @Autowired
    private var mapStructConvertService: ConvertService? = null

    @Test
	fun contextLoads() {
	}

	@Test
	fun testBeanUtils() {
		println("----- testBeanUtils -----")
		val sourceDTO = initSourceDto()
		val destinationDTO = initDestinationDto()
		val result = beanUtilsConvertService!!.convert(sourceDTO)
		assertEquals(result, destinationDTO)
	}

    @Test
    fun testMapStruct() {
        println("----- testMapStruct -----")
        val sourceDTO = initSourceDto()
        val destinationDTO = initDestinationDto()
        val result = mapStructConvertService!!.convert(sourceDTO)
        assertEquals(result, destinationDTO)
    }

    private fun initSourceDto(): SourceDTO {
		val sourceDTO = SourceDTO()
		sourceDTO.id = 1
		sourceDTO.name = "Test"
		sourceDTO.grade = 20.0
		sourceDTO.date = Date()
		return sourceDTO
	}

	private fun initDestinationDto(): DestinationDTO {
		val destinationDTO = DestinationDTO()
		destinationDTO.id = "1"
		destinationDTO.name = "Test"
		destinationDTO.grade = "20.0"
		destinationDTO.date = Date().toString()
		return destinationDTO
	}
}
