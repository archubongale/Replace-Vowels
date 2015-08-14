import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleUnitTest {

  @Test
  public void check_toReplaceVowelA_true() {
  WordPuzzle testResult = new WordPuzzle();
    assertEquals("-", testResult.replaceVowels("A"));
  }
}
