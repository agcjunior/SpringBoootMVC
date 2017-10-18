package hello;

import hello.model.Estagiario;
import hello.repository.EstagiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @Autowired
    private EstagiarioRepository estagiarioRepository;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World")
         String name, Model model) {

            Estagiario estagiario = estagiarioRepository.findOne(3);
            model.addAttribute("name", estagiario.getNome());
            return "greeting";
    }
}
