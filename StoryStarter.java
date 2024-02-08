public class StoryStarter {
    public static void main(String[] args) {
        /**
         * Main method that initializes the Story class.
         */
        Story a = new Story();
        Story.addStoryLine("Once upon a time, there lived a princess named %s. She was very pretty, but was also slightly %s. And she smelled like %s.");
        Story.addStoryLine("Once upon a time, there lived a toad named %s. It was very nice, but was also slightly %s. And it tasted like %s." );
        Story.addStoryLine("On a faraway land lived a %s. It was hideous and was %s. It was cruel and %s.");
        
    }
}

