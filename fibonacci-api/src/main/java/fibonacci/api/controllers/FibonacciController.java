package fibonacci.api.controllers;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.PathVariable;

import javax.inject.Singleton;

@Singleton
@Controller("/")
public class FibonacciController {
  @Get(produces = MediaType.TEXT_PLAIN)
  public String about() {
    return "This is the fibonacci api";
  }

  @Get("/{number}")
  public String calculateFibonacci(@PathVariable Integer number) {
    return calculate(number).toString();
  }

  public static Integer calculate(int a) {
    if(a <= 2) return 1;
    return calculate(a - 1) + calculate(a - 2);
  }
}
