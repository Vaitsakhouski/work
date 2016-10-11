package com.company;

/**
 * Class, which has all methods
 */
public class Rule {
    private String text = null;

    /**
     * Inicial of  string param
     */
    public Rule(String sq) {
        text = sq;
    }

    /**
     * Method, in which recorded all rules
     */
    public void rule() {
        WithoutNumber vs = new WithoutNumber(text);
        vs.rule1();
        OnlyNumbers sw = new OnlyNumbers(text);
        sw.rule2();
        Words wq = new Words(text);
        wq.rule3();
        DictionaryWords we = new DictionaryWords(text);
        we.rule4();
    }
}
