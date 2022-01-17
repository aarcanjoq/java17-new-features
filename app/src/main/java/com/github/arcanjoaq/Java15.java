package com.github.arcanjoaq;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Java15 {

    public static void main(String[] args) throws ScriptException {
        //JEP 378: Text Blocks
        final String html = """
                  <html>
                      <body>
                          <p>Hello, World</p>
                      </body>
                  </html>
                  """;
        System.out.println(html);

        //JEP 372: Remove the Nashorn JavaScript Engine
        final ScriptEngine nashorn = new ScriptEngineManager()
                .getEngineByName("Nashorn");
        System.out.println(nashorn);

        // JSR 223 javax.script API
        final ScriptEngine groovy = new ScriptEngineManager()
                .getEngineByName("groovy");
        System.out.println(groovy);
        final Integer sum = (Integer) groovy.eval("(1..10).sum()");
        System.out.println(sum);
    }

}