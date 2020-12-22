package lt2020.sveikinimai.kodasap.sveikinimo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lt2020.sveikinimai.kodasap.PagingData;
import lt2020.sveikinimai.kodasap.sveikinimo.data.Sveikinimas;
import lt2020.sveikinimai.kodasap.sveikinimo.data.SveikinimoDAO;
//import lt2020.sveikinimai.kodasap.sveikinimo.service.SveikinimoService;

@RestController
@ApiModel(value = "value ApiModel", description = "decription from ApiModel")
@Api(value = "sveikinimai is @Api")
@RequestMapping(value = "/api/sveikinimai")
@ControllerAdvice
public class SveikinimoController {
	@Autowired
	private PagingData pagingData;
//	private final SveikinimoService sveikinimoService; // pridedame DAO

	private final SveikinimoDAO sveikinimoDAO; // pridedame DAO

	@Autowired
	public SveikinimoController(SveikinimoDAO sveikinimoDAO) {
		this.sveikinimoDAO = sveikinimoDAO;
	}

//	@Autowired
//	public SveikinimoController(SveikinimoService sveikinimoService) {
//		this.sveikinimoService = sveikinimoService;
//	}

//	/* Apdoros užklausas: GET /api/users */
//	@RequestMapping(method = RequestMethod.GET)
//	@ApiOperation(value = "Get sveikinimai is @ApiOperation value", notes = "Returns registered sveikinimai is @ApiOperation notes")
//	public List<RestSveikinimas> getSveikinimai() {
//		pagingData.setLimit(10);
//		return sveikinimoService.getSveikinimai().stream()
//				.map(servisoSveikinimas -> new RestSveikinimas(servisoSveikinimas.getTekstas(),
//						servisoSveikinimas.getImage(), servisoSveikinimas.getAudio(),
//						servisoSveikinimas.getNameLastname(), servisoSveikinimas.getDateTime()))
//				.collect(Collectors.toList()); // skaitome per DAO
//	}

	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get users", notes = "Returns registered sveikimai")
	public List<Sveikinimas> geSveikinimas() {
		return sveikinimoDAO.getSveikinimai();
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Create sveikinima", notes = "Creates sveikinima with data")
	public void createSveikinima(
			@ApiParam(value = "Sveikinimo Data", required = true) @RequestBody final CreateSveikinimoCommand cmd) {
		sveikinimoDAO.createSveikinima(new Sveikinimas(cmd.getTekstas(), cmd.getImage(), cmd.getAudio(),
				cmd.getNameLastname(), cmd.getDateTime()));
	}

//	/* Apdoros užklausas: GET /api/users */
//	@RequestMapping(path = "/{tekstas}/", method = RequestMethod.GET)
//	public RestSveikinimas getSveikinimas(@PathVariable final String tekstas) {
//		System.out.println(tekstas);
//		var servisoSveikinimas = sveikinimoService.getSveikinimas(tekstas);
//		var restSveikinimas = new RestSveikinimas(servisoSveikinimas.getTekstas(),
//				servisoSveikinimas.getImage(),
//				servisoSveikinimas.getAudio(),
//				servisoSveikinimas.getNameLastname(),
//				servisoSveikinimas.getDateTime());
//		return restSveikinimas;
//	}
//
//	/* Sukurs vartotoją ir grąžins atsakymą su HTTP statusu 201 */
//	@RequestMapping(method = RequestMethod.POST)
//	@ResponseStatus(HttpStatus.CREATED)
//	public void createSveikinima(
//			@RequestBody @ApiParam(value = "Sveikinimi Data is @ApiParam", required = true)
//			@Valid final CreateSveikinimoCommand cmd) {
//		sveikinimoService.createSveikinima(new ServisoSluoksnioSveikinimas(cmd.getTekstas(),
//				cmd.getImage(),
//				cmd.getAudio(), 
//				cmd.getNameLastname(),
//				cmd.getDateTime()));
//	}

//	/* Apdoros užklausas: DELETE /api/users/<vartotojas> */
//	@RequestMapping(path = "/{tekstas}/", method = RequestMethod.DELETE)
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void deleteSveikinima(@PathVariable final String tekstas,
//			@PathVariable @ApiParam(value = "User Data is @ApiParam value", required = true) String email) {
//		sveikinimoService.deleteSveikinima(tekstas);
//		System.out.println(email);
//
//	}

	@RequestMapping(path = "/{tekstas}/", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable final String tekstas) {
		sveikinimoDAO.deleteSveikinima(tekstas);
	}

	public PagingData getPagingData() {
		return pagingData;
	}

	public void setPagingData(PagingData pagingData) {
		this.pagingData = pagingData;
	}
}
