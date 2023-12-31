package br.com.joaovbarreto.todolist.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


 /**
  * Modificador
  * public
  * private
  * protected
  */
@RestController
@RequestMapping("/users")
public class UserController {

  /**
   * String (texto)
   * Integer (int) numeros inteiros
   * Double (souble) Numeros 0.0000
   * Float (float) Numeros 0.0000
   * Char (A C)
   * Date (data)
   * void
   */
  @PostMapping("/")
  public void create(@RequestBody UserModel userModel) {
      System.out.println(userModel.name);
  }

}
