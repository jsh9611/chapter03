package chapter03;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song();
		song.setAlbum("Real");
		song.setArtist("아이유");
		song.setTitle("좋은날");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);

		song.show();
		
		Song song2 = new Song();

		song2.setArtist("브라운아이드걸스");
		song2.setTitle("원더우먼");

		song2.show();
		
	}

}
