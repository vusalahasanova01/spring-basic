package miniproject.example.demo.service;

import miniproject.example.demo.util.Util;
import org.springframework.stereotype.Service;

@Service
public class TextService {
  public String testWord(String text) {
    if (Util.library.contains(text)) {
      return text;
    }
    return null;
  }
}
