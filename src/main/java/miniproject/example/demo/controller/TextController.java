package miniproject.example.demo.controller;

import lombok.RequiredArgsConstructor;
import miniproject.example.demo.service.TextService;
import miniproject.example.demo.util.Util;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("text")
@RequiredArgsConstructor
public class TextController {
  private final TextService textService;

  @GetMapping("check")
  public String add(@RequestParam("x") String x) {
    String result = textService.testWord(x);
    return String.format("this %s is in the list",
        result
    );
  }

  @PostMapping("add")
  public String test3(@RequestBody String x) {
    if(textService.testWord(x)!=null){
      Util.library.add(x);
      return "new word added";
    }
    else {
      return  String.format("this %s is in the list",
          x
      );
    }

  }
}
