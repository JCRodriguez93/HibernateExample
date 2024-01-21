package view;

import controllers.UserController;

import java.util.Scanner;

public class UserView {

	public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        String str = "";
        int op = 0;

        while (op != 5) {
            try {
                String menu = "**Seleccionar operación**\n\n" + "1. Crear usuario.\n" + "2. Obtener usuario.\n"
                        + "3. Actualizar usuario.\n" + "4. Borrar usuario.\n" + "5. Salir.\n\nIndique su opción: ";
                System.out.print(menu);

                String decission = src.nextLine();
                op = Integer.parseInt(decission);
                switch (op) {

                    case 1: { // crear usuario
                        System.out.print("\tNombre: ");
                        String name = src.nextLine();
                        System.out.print("\tApellidos: ");
                        String surname = src.nextLine();
                        System.out.print("\tDireccion: ");
                        String direction = src.nextLine();
                        str = new UserController().createUser(name, surname, direction);

                        System.out.println(str);
                        break;
                    }
                    case 2: { // obtener usuario
                        System.out.print("Indique el ID del usuario: ");
                        String id = src.nextLine();
                        str = new UserController().readUser(Integer.parseInt(id));
                        System.out.println(str);
                        break;
                    }
                    case 3: { // actualizar usuario
                        System.out.print("Indique el ID del usuario: ");
                        String id = src.nextLine();
                        System.out.print("Indique el nuevo nombre del usuario: ");
                        String name = src.nextLine();
                        str = new UserController().updateUser(Integer.parseInt(id), name);
                        System.out.println(str);
                        break;
                    }
                    case 4: { // borrar usuario
                        System.out.print("Indique el ID del usuario: ");
                        String id = src.nextLine();
                        str = new UserController().deleteUser(Integer.parseInt(id));
                        System.out.println(str);
                        break;
                    }
                    case 5: { //na el programa
                        System.out.println("Conexión cerrada");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("no has indicado un número correcto.");
            }

        }
    }

}
