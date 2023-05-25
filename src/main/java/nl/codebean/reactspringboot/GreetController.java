package nl.codebean.reactspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class GreetController {

  @RequestMapping("/api/greet")
  public String greet() {
    return "Hello, the time at the server is now " + new Date() + "\n";
  }
}
