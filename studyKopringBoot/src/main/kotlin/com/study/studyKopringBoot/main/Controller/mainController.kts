import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class MainController {

    @GetMapping("/")
    @ResponseBody
    fun hello(): String {
        return "메인 컨트롤러"
    }


}