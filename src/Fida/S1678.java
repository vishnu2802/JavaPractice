package Fida;

public class S1678 {
	public String interpret(String command) {
		return command.replace("()", "o").replace("(al)", "al");

//         StringBuilder sb = new StringBuilder();

//         for(int i = 0; i < command.length(); i++){

//             if(command.charAt(i) == '('){
//                 if(command.charAt(i + 1) == ')'){
//                     sb.append("o");
//                     i++;
//                 } else {
//                     sb.append("al");
//                     i += 3;
//                 }
//             } else {
//                 sb.append(command.charAt(i));
//             }
//         }

//         return sb.toString();
	}
}
