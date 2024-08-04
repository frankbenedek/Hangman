import java.util.Random;

public class Words {
    private String[] words;

    public Words() {
        words = new String[]{
                "apple", "banana", "orange", "grape", "mango",
                "peach", "cherry", "melon", "pear", "kiwi",
                "apricot", "avocado", "blueberry", "blackberry", "cranberry",
                "coconut", "fig", "guava", "lemon", "lime",
                "lychee", "mandarin", "nectarine", "papaya", "passionfruit",
                "pineapple", "plum", "pomegranate", "raspberry", "strawberry",
                "tangerine", "watermelon", "cantaloupe", "honeydew", "jackfruit",
                "kumquat", "loquat", "mulberry", "olive", "persimmon",
                "plantain", "quince", "starfruit", "soursop", "tamarind",
                "clementine", "durian", "elderberry", "gooseberry", "grapefruit",
                "mangosteen", "miracleberry", "nashi", "rambutan", "redcurrant",
                "salak", "sapote", "satsuma", "ugli", "acerola",
                "bilberry", "boysenberry", "chayote", "cloudberry", "feijoa",
                "jabuticaba", "jambul", "juniper", "kiwifruit", "lulo",
                "mamey", "mangaba", "medlar", "physalis", "pitanga",
                "pitaya", "pricklypear", "rhubarb", "rowan", "seagrape",
                "sugarapple", "yuzu", "acai", "ackee", "alangium",
                "aloe", "appleberry", "aronia", "bael", "barberry",
                "bayberry", "beachplum", "bignay", "bittermelon", "breadfruit",
                "buffaloberry", "camu", "cashewapple", "cherimoya", "chokeberry",
                "coroba", "custardapple", "dewberry", "elephantapple", "emblic",
                "garcinia", "goumi", "grape", "hackberry", "hawthorn",
                "hearts-of-palm", "hornedmelon", "indianfig", "jatoba", "jocote",
                "jostaberry", "kaffir-lime", "keppel", "langsat", "lemonadeberry",
                "lingonberry", "lucuma", "malayapple", "mammeeapple", "mamoncillo",
                "marionberry", "maypop", "meiwa-kumquat", "midyim", "miraclefruit",
                "mombin", "monkfruit", "mountainpepper", "muscadine", "naranjilla",
                "natal-plum", "noni", "panama-berry", "pawpaw", "pili",
                "pineberry", "plumcot", "pulasan", "redbanana", "roseapple",
                "saskatoon", "screwpine", "serviceberry", "sorbus", "souari-nut",
                "spanishlime", "swingle-citrumelo", "sweetie", "sweetlime", "tangelo",
                "tayberry", "thimbleberry", "ugni", "vaccinium", "velvet-apple",
                "voavanga", "waxapple", "wildjack", "xigua", "yangmei",
                "yew", "yunnan-hackberry", "ziziphus", "zorra", "abiu",
                "acacia", "airpotato", "alangium", "alligator-apple", "apricot",
                "arbutus", "arrowhead", "asianpear", "atemoya", "azedarach",
                "babassu", "bamboo", "barbadoscherry", "bearberry", "bitter-melon",
                "blackberry", "blueberry", "brazilnut", "breadfruit", "bushbanana",
                "butterfly-pea", "calamondin", "camu-camu", "candlenut", "canistel",
                "capuli-cherry", "carambola", "carrotwood", "cashew", "cassabanana",
                "cattail", "chayote", "cherimoya", "cherry", "chestnut",
                "chokecherry", "chontaduro", "coconut", "comfrey", "cranberry",
                "cranberrybush", "currant", "custardapple", "damson-plum", "dewberry",
                "dragon-fruit", "dwarfbananas", "elderberry", "elephant-apple", "eskimo-potato",
                "feijoa", "fig", "fingerlime", "flamboyant", "freedom-fig",
                "fruit-salad-tree", "galangal", "gamboge", "genip", "ginkgo",
                "ginseng", "goji", "goldenberry", "grewia", "guava",
                "hackberry", "hazelnut", "hedychium", "heliconia", "himalayan-honeyberry",
                "hollyberry", "huckleberry", "ice-cream-bean", "indian-juniper", "indianprune",
                "jaboticaba", "jatoba", "jicama", "kaffir-lime", "kanaga",
                "karanda", "keiyama", "ketembilla", "kiwifruit", "kola",
                "kowhai", "kumquat", "langsat", "lantana", "laurel",
                "lemon", "linseed", "logwood", "loquat", "macadamia",
                "mango", "mangosteen", "marang", "mayhaw", "medlar",
                "melon", "mezquite", "miracle", "midgen-berry", "muscadine",
                "nashi-pear", "noni", "ohelo", "pedunculated", "pitanga",
                "red-mulberry", "rosa", "rudraksha", "santol", "sausagefruit",
                "silk-cotton-tree", "soapberry", "sorbus", "soursop", "sweetlime",
                "sweetsop", "tamarillo", "vanilla", "viburnum", "waxjambu",
                "wolfberry", "yangmei", "yellow-mombin", "zucchini", "zuniga",
                "babaco", "bilimbi", "calabash", "calamansi", "camachile",
                "carambola", "cherryoftherio-grande", "cucumbertree", "damson", "desertlime",
                "dugannella", "emblic", "figof-barbaria", "ficus", "grumichama",
                "illawarra", "indian-prune", "jaboticaba", "jungle-jalebi", "karonda",
                "kishu", "lacuna", "laurel", "macadamia", "manila-tamarind",
                "mayhaw", "mescal", "mombin", "muscadine", "niyog",
                "ohelo", "opium", "pitanga", "red-mulberry", "rosa",
                "rudraksha", "santol", "sausagefruit", "silk-cotton-tree", "soapberry",
                "sour-cherry", "sweetgranadilla", "sweetlime", "sweetsop", "tamarind",
                "vanilla", "viburnum", "voavanga", "waxjambu", "wolfberry",
                "xanthium", "yangmei", "yangtao", "yellow-mombin", "zucchini"

        };
    }
    public String getRandomWord(){
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    }
}
