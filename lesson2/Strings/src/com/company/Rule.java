package com.company;

/**
 * Created by NotePad.by on 10.10.2016.
 */
public class Rule {
    private String text = null;

    public Rule(String sq) {
        text = sq;
    }

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
