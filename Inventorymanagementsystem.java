import java.util.ArrayList;
class Artwork
{
    int id;
    String title;
    String artist;
    int esti_val;
    public Artwork(int id, String title, String artist, int esti_val)
    {
        this.id=id;
        this.title=title;
        this.artist=artist;
        this.esti_val=esti_val;
    }
}
public class Inventorymanagementsystem
{
    private ArrayList<Artwork> inventory=new ArrayList<>();

    public static void main(String[] args)
    {
        Inventorymanagementsystem ims = new Inventorymanagementsystem();
        ims.additems(01,"ABC","RAVI",1460);
        ims.additems(02,"EFG","KAVYA",20000);
        ims.additems(03,"XYZ","SOWMYA",100000);
        System.out.println();
        ims.displayinventory();
        System.out.println("updated artwork");
        ims.updateitems(03,"PQR","KARUNYA",150000);
        ims.displayinventory();
        System.out.println("after removing the artwork");
        ims.removeitem(02);
        ims.displayinventory();
        }

    public void additems(int id, String title, String artist, int esti_val)
    {
        Artwork item= new Artwork(id,title,artist,esti_val);
        inventory.add(item);
    }
    public void updateitems(int id, String title, String artist, int esti_val)
    {
        for(Artwork item : inventory)
        {
            if(item.id==id)
            {
                item.title=title;
                item.artist=artist;
                item.esti_val=esti_val;
            }
        }
    }
    public void removeitem(int id){
        for(Artwork item : inventory) {
            if(item.id==id) {
                inventory.remove(item);
                break;
            }
        }
    }
    public void displayinventory()
    {
        for(Artwork item : inventory)
        {
            System.out.println("unique ID:" +item.id+ "Title:" +item.title+ "Artist" +item.artist+ "Estimated value" +item.esti_val );
        }
    }
}

/*output
"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4.1\lib\idea_rt.jar=63722" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Admin\Documents\a\INCHARA_JAP\out\production\INCHARA_JAP Inventorymanagementsystem

unique ID:1Title:ABCArtistRAVIEstimated value1460
unique ID:2Title:EFGArtistKAVYAEstimated value20000
unique ID:3Title:XYZArtistSOWMYAEstimated value100000
updated artwork
unique ID:1Title:ABCArtistRAVIEstimated value1460
unique ID:2Title:EFGArtistKAVYAEstimated value20000
unique ID:3Title:PQRArtistKARUNYAEstimated value150000
after removing the artwork
unique ID:1Title:ABCArtistRAVIEstimated value1460
unique ID:3Title:PQRArtistKARUNYAEstimated value150000

Process finished with exit code 0

 */