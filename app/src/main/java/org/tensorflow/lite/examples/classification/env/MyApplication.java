package org.tensorflow.lite.examples.classification.env;

import android.app.Application;

import org.tensorflow.lite.examples.classification.Species;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApplication  extends Application {

    private static List<Species> allSpecies = new ArrayList<Species>();
    private static List<Species> speciesList = new ArrayList<Species>();
    private static  int nextId = 21;

    public MyApplication() {
        fillSpecies();
    }

    public void fillSpecies() {
        Species f0 = new Species(0, "Plantae 0", "Planta 0", "A Planta 0 é uma planta especial. O seu habitat natural é o IKEA mas adapta-se com facilidade a qualquer divisão da sua casa.", "https://dl3.pushbulletusercontent.com/4rrGsIs5OgZiaGZ5eiJnP12vagKldAIs/20220705_190827.jpg", "common", false);
        Species f1 = new Species(1, "Plantae 1", "Planta 1", "A Planta 1 é uma planta especial. O seu habitat natural é o IKEA mas adapta-se com facilidade a qualquer divisão da sua casa.", "https://dl3.pushbulletusercontent.com/nf3R0fEz8ZKfTWztr0E4xiroPCno7ejK/20220705_115624.jpg", "common", false);
        Species f2 = new Species(2, "Plantae 2", "Planta 2", "A Planta 2 é uma planta especial. O seu habitat natural é o IKEA mas adapta-se com facilidade a qualquer divisão da sua casa.", "https://dl3.pushbulletusercontent.com/6cN4Xy9Kk6LrIfDoq8AKXvSpBr6xImTz/20220705_191005.jpg", "common", false);
        Species f3 = new Species(3, "Plantae 3", "Planta 3", "A Planta 3 é uma planta especial. O seu habitat natural é o IKEA mas adapta-se com facilidade a qualquer divisão da sua casa.", "https://dl3.pushbulletusercontent.com/aFZBdM4q6EMtxMspWxMlTmZjSQUpaCH3/20220705_190409.jpg", "common", false);
        Species f4 = new Species(4, "Plantae 4", "Planta 4", "A Planta 4 é uma planta especial. O seu habitat natural é o IKEA mas adapta-se com facilidade a qualquer divisão da sua casa.", "https://dl3.pushbulletusercontent.com/nqJmqmbfDt9FyZDLeG1uZVNdvDMCm8yl/20220705_190205.jpg", "common", false);
        Species f5 = new Species(5, "Plantae 5", "Planta 5", "A Planta 5 é uma planta especial. O seu habitat natural é o IKEA mas adapta-se com facilidade a qualquer divisão da sua casa. Parecida com o alecrim a planta 5 é a única com coloração roxa.", "https://dl3.pushbulletusercontent.com/N7jhTC7Av1TFEbNia63Pvf7uNPKcjHMn/20220705_185914.jpg", "common" ,false);
        Species f21 = new Species(6, "Pinus pinea", "Pinheiro-manso", "", "https://dl3.pushbulletusercontent.com/byrtk5f3PINsx9R5uGqNrsd6qSM2aFSK/italian-stone-pine-growing-tips-3269335-hero-76a453bebae24ff894000b59a6545946.jpg", "common", true);
        Species f7 = new Species(7, "Hedera helix", "Hera", "", "https://dl3.pushbulletusercontent.com/A3ujPc1DWnDEze3EJheV8902Iat3f0B5/Hera_3_500x500.png", "common", true);
        Species f8 = new Species(8, "Alnus glutinosa", "Amieiro", "", "https://dl3.pushbulletusercontent.com/aOmBwt6oxxQdUJ9phJo4so9ZmBrFrPC0/amieiro2021.jpg", "common", true);
        Species f9 = new Species(9, "Hibiscus syriacus", "Hibisco", "", "https://dl3.pushbulletusercontent.com/5oC7Ygp3elVF1Lz6zeqrKM15T8tE6Blq/o-que-%C3%A9-hibisco-capa.jpg", "common", true);
        Species f10 = new Species(10, "Eucalyptus camaldunensis", "Eucalipto", "", "https://dl3.pushbulletusercontent.com/8EenocZvkZQ8LRR6yXJHmrJStVdM6BAO/A-large-old-tree-river-red-gum-Eucalyptus-camaldulensis-and-its-habitat-features-Top.png", "common", true);
        Species f11 = new Species(11, "Camellia sasanqua", "Camélia-chinesa", "", "https://dl3.pushbulletusercontent.com/0u8TvonAqmufCka49zrsuUKvUceq9nNo/eyJidWNrZXQiOiJ3ZWItbmluamEtaW1hZ2VzIiwia2V5Ijoid2FybmVyc1wvcHJvZHVjdC1ncm91cFwvY2FtZWxsaWFzYXNhbnF1YXl1bGV0aWRlXzIuSl.webp", "common", true);
        Species f12 = new Species(12, "Cistus ladanifer", "Esteva", "", "https://dl3.pushbulletusercontent.com/R7YC9gMfPESaTagQtnTUldal5SV01x90/cistus2-1024x683.jpg", "common", true);
        Species f13 = new Species(13, "Magnolia grandiflora", "Magnólia", "", "https://dl3.pushbulletusercontent.com/1bATSBONm0EtOyE4XeKKEh5sB4uQi4Tb/MAGN-KB0613-D.jpg", "common", true);
        Species f14 = new Species(14, "Quercus suber", "Sobreiro", "O sobreiro é uma árvore extremamente bem adaptada ao clima mediterrânico: tem raízes profundas para captar água em profundidade, folhas com cutícula para impedir o excesso de transpiração, perdendo assim menos água pela superfície e uma casca espessa e esponjosa que a protege dos incêndios, a cortiça.", "https://dl3.pushbulletusercontent.com/9sIYA7vr7gj1SqyCRcQlPRSeKiGDmFgv/oak-1710777_1920.jpg", "common", true);
        Species f15 = new Species(15, "", "", "", "", "common", true);
        Species f16 = new Species(16, "Larus michahellis", "Gaivota-argêntea", "", "https://dl3.pushbulletusercontent.com/UnO9YFlxjE1jNU7RFnabiGNSdHDQYBPG/istockphoto-512804306-612x612.jpg", "common", true);
        Species f17 = new Species(17, "Larus ridibundus", "Guincho comum", "", "https://dl3.pushbulletusercontent.com/jUtgxNPR2iEEvFl4F35fTf38UjO2jD0C/24917753.jpg", "common", true);Species f6 = new Species(6, "", "", "", "", "common", true);
        Species f18 = new Species(18, "Gallinula chloropus", "Galinha d'água", "", "https://dl3.pushbulletusercontent.com/RwUMqFom49xp1GREDqsKogshPqmXXXWp/1800.jpeg.jpg", "common", true);
        Species f19 = new Species(19, "Anser anser", "Ganso", "", "https://dl3.pushbulletusercontent.com/1WzCE2dfoYzIrUaBvElpSvUflfUcdu1D/Untitled110_20220720172743.png", "common", true);
        Species f20 = new Species(20, "Anas platyrhynchos", "Pato-real", "O macho adulto tem a cabeça de cor verde iridescente e um anel branco no pescoço, dorso e ventre castanhos acinzentados e o peito castanho-escuro. A fêmea possui tons acastanhados, sendo semelhante a outras espécies de patos de superfície. O pato-real (Anas platyrhynchos) prefere as zonas de águas pouco profundas.", "https://dl3.pushbulletusercontent.com/B9c3F5LVBPHjBYC5jYV1e4xYBbmkfJbn/1200px-Anas_platyrhynchos_male_female_quadrat.jpg", "common", true);


        allSpecies.addAll(Arrays.asList( new Species[] { f0, f1, f2, f3, f4, f5})); //, f21, f7, f8, f9, f10, f11, f12, f13, f14, f16, f17, f18, f19, f20

        //allSpecies = speciesList;

        // check if the species was already found, if so add to the SpeciesList
        for (Species s: allSpecies) {
            if (s.getWasFound() == true) {
                speciesList.add(s);
            }
        }

        //speciesList.addAll(Arrays.asList( new Species[] { f0, f1, f2, f3, f4, f5}));


    }

    public static List<Species> getSpeciesList() {
        return speciesList;
    }

    public static List<Species> getAllSpecies() {
        return allSpecies;
    }

    public static void setAllSpecies(List<Species> allSpecies) {
        MyApplication.allSpecies = allSpecies;
    }

    public static void setSpeciesList(List<Species> speciesList) {
        MyApplication.speciesList = speciesList;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MyApplication.nextId = nextId;
    }

}
