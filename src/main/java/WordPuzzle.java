import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class WordPuzzle {


 public static void main(String[] args) {

    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String userInputtedString= request.queryParams("userInput");

      String userOutput = replaceVowels(userInputtedString);
           model.put("userOutput", userOutput);
           model.put("userInput", userInputtedString);

           return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
      }

  public static String replaceVowels(String userInput) {

    //String convertedInput =  userInput.toUpperCase();
    String[] characters = userInput.split("");

  //char[] charStr = userInput.toCharArray();
      String output;
      for(String letter : characters){

        if(userInput == "A")
        output = characters.replace("userInput","-"");

        // else if(charStr == 'a')
        // output = userInput.replace("charStr",'-');
        // else if(charStr == 'E')
        //     output = userInput.replace("charStr",'-');
        //     else if(charStr == 'e')
        //     output = userInput.replace("charStr(i)",'-');
        //
        //     else if(charStr(i) == 'I')
        //     output = userInput.replace("charStr(i)",'-');
        //     else if(charStr(i) == 'i')
        //     output = userInput.replace("charStr(i)",'-');
        //
        //     else if(charStr(i) == 'O')
        //     output = charStr.replace("charStr(i)",'-');
        //     else if(charStr(i) == 'o')
        //     output = userInput.replace("charStr(i)",'-');
        //
        //     else if(charStr(i) == 'U')
        //     output = charStr.replace("charStr(i)",'-');
        //     else if(charStr(i) == 'u')
        //     output = userInput.replace("charStr(i)",'-');

          }
          return output;
      }
}
