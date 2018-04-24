package nl.tudelft.jpacman.npc.ghost;

import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.level.LevelFactory;
import nl.tudelft.jpacman.level.MapParser;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.sprite.PacManSprites;

import java.util.List;

/**
 * A test helper utility for writing the ghost unit tests.
 */
public final class GhostMapParser extends MapParser {
    private final GhostFactory ghostFactory;
    private final BoardFactory boardFactory;

    /**
     * Creates a new enhanced map parser.
     * This map parser allows users to specify which ghost should be placed
     * at an exact location.
     *
     * @param levelFactory The factory providing the NPC objects and the level.
     * @param boardFactory The factory to create board elements.
     * @param ghostFactory the factory to create the ghosts.
     */
    private GhostMapParser(LevelFactory levelFactory, BoardFactory boardFactory,
                           GhostFactory ghostFactory) {
        super(levelFactory, boardFactory);
        this.boardFactory = boardFactory;
        this.ghostFactory = ghostFactory;
    }

    /**
     * Utility method for convenient ghostMapParser creation.
     *
     * @return A wired up ghostMapParser ready for action!
     */
    public static GhostMapParser create() {
        PacManSprites pacManSprites = new PacManSprites();
        GhostFactory ghostFactory = new GhostFactory(pacManSprites);
        return new GhostMapParser(
                new LevelFactory(pacManSprites, ghostFactory),
                new BoardFactory(pacManSprites),
                ghostFactory
        );

    }

    //This method only supports clyde for now
    //You should add extra cases for ghosts you need.
    @Override
    protected void addSquare(Square[][] grid, List<Ghost> ghosts,
                             List<Square> startPositions, int x, int y, char c) {
        switch (c) {
            case 'C':
                grid[x][y] = makeGhostSquare(ghosts, ghostFactory.createClyde());
                break;
            default:
                super.addSquare(grid, ghosts, startPositions, x, y, c);
        }
    }

    private Square makeGhostSquare(List<Ghost> ghosts, Ghost ghost) {
        Square ghostSquare = this.boardFactory.createGround();
        ghosts.add(ghost);
        ghost.occupy(ghostSquare);
        return ghostSquare;
    }
}
