public class Main {
    public static void main(String[] args) {
        String[] roles = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука", "Лука Лукич", "Немой"};
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор."
                , "Аммос Федорович: Как ревизор?"
                , "Артемий Филиппович: Как ревизор?"
                , "Лука: Тра ля ля, тарам-парам"
                , "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем."
                , "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!"
                , "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
                , "Лука Лукич: Господи боже! Лука: еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder dialog = new StringBuilder();
        for(int i = 0; i < roles.length; i++){
            dialog.append(roles[i]).append(":").append("\n");
            for(int j =0; j < textLines.length; j++){
                String replica = textLines[j];
                if (replica.startsWith(roles[i] + ":" )){
                    String replica2 = replica.replaceFirst(roles[i] + ":" , String.valueOf(j+1) + ")");
                    dialog.append(replica2).append("\n");
                }
            }
            dialog.append("\n");
        }
        return String.valueOf(dialog);
    }
}