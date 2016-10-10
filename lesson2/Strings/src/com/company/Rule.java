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
        Rule1 vs = new Rule1(text);
        vs.rule1();
        Rule2 sw = new Rule2(text);
        sw.rule2();
        Rule3 wq = new Rule3(text);
        wq.rule3();
        Rule4 we = new Rule4(text);
        we.rule4();
    }
}
