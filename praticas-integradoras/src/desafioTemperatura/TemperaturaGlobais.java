package desafioTemperatura;

public class TemperaturaGlobais {
    public static void main(String[] args) {

        String listCountries[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "Sao Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int temperatures[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int minTemp = 0;
        int minCountry = 0;
        int maxTemp = 0;
        int maxCountry = 0;

        for (int i = 0; i < 10; i += 1) {
            if (temperatures[i][0] < minTemp) {
                minTemp = temperatures[i][0];
                minCountry = i;
            }
            if (temperatures[i][1] > maxTemp) {
                maxTemp = temperatures[i][1];
                maxCountry = i;
            }
        }
        System.out.println("A temperatura mais baixa foi em " + listCountries[minCountry] + " com: " + temperatures[minCountry][0]);
        System.out.println("A temperatura mais alta foi em " + listCountries[maxCountry] + " com: " + temperatures[maxCountry][1]);

    }

}