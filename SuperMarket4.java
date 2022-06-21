class SuperMarket4{
static String biscts[] = {"Oreo","Darkfantasy","Bourborn","Hideandseek","Gooday","Momsmagic","ParleG"};
static String vegetables[]={"Tamato","carrot","Potato","onion","Brocolli","Betroot","Lemon","Beans"};
static String sportsitems[]={"Bat","Ball","gloves","Dumbell","Hockey","Legpads","Volleyball"}; 
static String deos[]={"wildstone","Setwet","Parkavenue","Ks","Denver","Spins","Fogg","Cobra"};
static String soaps[]={"medmix","Dove","Santoor","Lifeboy","Mysoresandal","Rin","win"};
static String coolDrinks[]={"Pepsi","merinda","sting","Hell","Redbull","Monster","7up"};
static String Fruits[]={"Apple","Orange","Kiwifurit","Papaya","Chiku","Butterfurit","Pomagrannet"};
static String chocolates[]={"Dairymilk","Kitkat","Peark","Darkchocolate","Milkybar","5star","Munch"};
static String snacks[]= {"Peanuts ","Mogdall","Lays","kurkure","Littlehearts","Cheetos","Doritos"};
static String grocerries[]= {"Refainedoil","Rice","wheat","Greenpeas","maida","peanuts","salt"};
static String detergents[]= {"Dishwash","Rin","Comfort","Washingpowder","Harpic"};
static String electronicitems[] ={"washingmachine","laptop","Tv","Refrigerator","geaser","Bulb"};
static String giftitems[] = {"photoframe","Dress","watch","Doll","Giftcard","cup"};                                           
static int vegetablesprice[]= {30,40,50,60,70,80,};



public static void main(String a[])
{
String bis = getBiscts("Oreo");
System.out.println("come....will eat the biscts  "+bis);

 String value = getVegetables("carrot");
 System.out.println("bring 1kg of "+ value );
 
 String value1 = getSportsItems("Dumbell");
System.out.println(" bring 5kg "+ value1);

String value2 = getDeos("wildstone");
System.out.println("bring "+ value2);

String value3 = getSoaps("medmix");
System.out.println("bring one " + value3); 

}

public static String getBiscts(String bisct)
{
String bisctsName = null;
for(int i=0; i < biscts.length;i++)
{
if(biscts[i] == bisct){
bisctsName = biscts[i];
}

}
return bisctsName;
}

//......................................................
	

public static String getVegetables(String vegetable)
{
	String vegetablesName = null;
	for(int i=0; i<vegetables.length;i++)
	{
		if(vegetables[i] == vegetable){
			vegetablesName = vegetables[i];
		}
		else{
			System.out.println(vegetable + " is not available in list" );
		}
	}
	return vegetablesName;
}
//....................................................

public static String getSportsItems(String SportsItem)
{
String itemsName = null;
for(int i=0; i<sportsitems.length; i++)	
{
	if(sportsitems[i] == SportsItem)
	{itemsName = sportsitems[i];}
	
}
	
 return itemsName;	
}

//......................................................
public static String getDeos(String deo)
{
	String deoName = null;
	for(int i=0; i<deos.length;i++)
	{
		if(deos[i] == deo )
		{
			deoName = deos[i];
		}
	}

    return deoName;
}
//...............................................
public static String getSoaps(String soap)
{
String soapName = null;
for(int i=0; i<soaps.length;i++)	
{
	if(soaps[i] == soap)
	{
		soapName = soaps[i];
	}	
}
	return soapName;	
}















}





