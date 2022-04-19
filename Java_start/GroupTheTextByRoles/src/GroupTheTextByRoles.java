/**
 * Метод, который группирует строчки по ролям, пронумеровывает их
 * и возвращает результат в виде готового текста.
 */

public class GroupTheTextByRoles {

    public static void main(String[] args) {

        String[] roles = {"Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};

        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {

        int ind, k;
        String bufrole = new String();
        String buftext = new String();
        String result = new String();
        int l,j,i = 0;
        StringBuffer sbuf = new StringBuffer();
        StringBuffer text = new StringBuffer();

        for (l = 0; l < roles.length ; l++) {

            for (k = 0; k<textLines.length; k++) {

                ind = textLines[k].indexOf(":");
                bufrole = textLines[k].substring(0, ind);
                buftext = textLines[k].substring(ind + 1);

                if (bufrole.equals(roles[l])) {
                    text.append((k+1)+")"+buftext+'\n');
                }
            }

            sbuf.append('\n'+roles[l]+":"+'\n'+text);
            text.delete(0,text.length());
        }

        return sbuf.toString();
    }
}
