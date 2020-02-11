package feb.assessment.ui.controller;

import feb.assessment.ui.response.RandomNumberResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/assessment")
// Map '/assessment' with current controller
public class Controller {

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE })
    // Produce JSON for RandomNumberResponse with its attributes
    public RandomNumberResponse getData(HttpServletResponse response){
        // Setting the header for the frontend access
        response.setHeader(
                "Access-Control-Allow-Origin", "*");
        // Return an instance of a RandomNumberResponse
        return new RandomNumberResponse();
    }

}
