package br.com.aulaunifacs;


import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public class AulaCI {


    @GetMapping("/")
    public String testeCI(){
        return "CI Funcionando";
    }


}
