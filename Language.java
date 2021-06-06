
public class Language {

  private String name;
  private String hello;

  public static final Language[] languages = {
    new Language("English", "Hello"),
    new Language("Spanish", "Hola"),
    new Language("French", "Bonjour"),
    new Language("Italian", "Ciao"),
    new Language("Russian", "Privet"),
    new Language("Japanese","Kon'nichiwa"),
    new Language("Chinese","Nǐn hǎo"),
    new Language("German","Guten Tag"),
    new Language("Portuguese","Olá"),
    new Language("Arabic","Asalaam alaikum"),
    new Language("Danish","Goddag"),
    new Language("Swahili","Shikamoo"),
    new Language("Dutch","Goedendag"),
    new Language("Greek","Yassas"),
    new Language("Polish","Cześć’"),
    new Language("Hindi","Namaste"),
    new Language("Turkish","Merhaba"),
    new Language("Indonesian","Selamat siang"),
    new Language("Hebrew","Shalom"),
    new Language("Swedish","God dag"),
    new Language("Bengali","Hyālō"),
    new Language("Vietnamese","Xin chào"),
    new Language("Thai","Sà-wàt-dii"),
    new Language("Armenian","Barev"),
    new Language("Ukranian","Dobryj den"),
    new Language("Uzbek","Salom"),
    new Language("Romanian","Bună"),
  };

  public Language(String name, String hello) {
    this.name = name;
    this.hello = hello;
  }

  public String getName() {
    return name;
  }
  public String getHello() {
    return hello;
  }
}