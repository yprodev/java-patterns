public class SongListGenerator {
	public static void main(String[] argv) {

		SongComponent industrialMusic = new SongGroup("\nIndustrial", "");
		SongComponent heavyMetalMusic = new SongGroup("\nHeavy Metal", "");
		SongComponent dubstepMusic = new SongGroup("\nDubstep", "");

		SongComponent everySong = new SongGroup("Song List", "Every song available");

		everySong.add(industrialMusic);
		industrialMusic.add(new Song("Head like a song", "NIN", 1990));
		industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

		industrialMusic.add(dubstepMusic);
		dubstepMusic.add(new Song("Centipede", "Knife party", 2012));
		dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

		everySong.add(heavyMetalMusic);
		heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
		heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

		DiscJockey crazyLarry = new DiscJockey(everySong);

		crazyLarry.getSongList();

	}
}
