package power.api.controllers;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import javax.inject.Singleton;

@Singleton
@Controller("/")
public class PowerController {
  @Get(produces = MediaType.TEXT_PLAIN)
  public String about() {
    return "This is the power api";
  }

  @Get("/{number1}/{number2}")
  public String calculatePower(@PathVariable Integer number1, @PathVariable Integer number2) {
    return calculate(number1, number2).toString();
  }

  public static Double calculate(int a, int b) {
    return Math.pow(a, b);
  }
}
