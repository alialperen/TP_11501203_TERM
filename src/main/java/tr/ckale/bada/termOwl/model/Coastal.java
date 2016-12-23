package tr.ckale.bada.termOwl.model;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Coastal <br>
 * @version generated on Wed Dec 21 09:21:49 MSK 2016 by Alperen
 */

public interface Coastal extends HumanMadeStructure {

    /* ***************************************************
     * Property http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#crosses
     */
     
    /**
     * Gets all property values for the crosses property.<p>
     * 
     * @returns a collection of values for the crosses property.
     */
    Collection<? extends Place> getCrosses();

    /**
     * Checks if the class has a crosses property value.<p>
     * 
     * @return true if there is a crosses property value.
     */
    boolean hasCrosses();

    /**
     * Adds a crosses property value.<p>
     * 
     * @param newCrosses the crosses property value to be added
     */
    void addCrosses(Place newCrosses);

    /**
     * Removes a crosses property value.<p>
     * 
     * @param oldCrosses the crosses property value to be removed.
     */
    void removeCrosses(Place oldCrosses);


    /* ***************************************************
     * Property http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#hasLocationData
     */
     
    /**
     * Gets all property values for the hasLocationData property.<p>
     * 
     * @returns a collection of values for the hasLocationData property.
     */
    Collection<? extends Datum> getHasLocationData();

    /**
     * Checks if the class has a hasLocationData property value.<p>
     * 
     * @return true if there is a hasLocationData property value.
     */
    boolean hasHasLocationData();

    /**
     * Adds a hasLocationData property value.<p>
     * 
     * @param newHasLocationData the hasLocationData property value to be added
     */
    void addHasLocationData(Datum newHasLocationData);

    /**
     * Removes a hasLocationData property value.<p>
     * 
     * @param oldHasLocationData the hasLocationData property value to be removed.
     */
    void removeHasLocationData(Datum oldHasLocationData);


    /* ***************************************************
     * Property http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#isPartOf
     */
     
    /**
     * Gets all property values for the isPartOf property.<p>
     * 
     * @returns a collection of values for the isPartOf property.
     */
    Collection<? extends Place> getIsPartOf();

    /**
     * Checks if the class has a isPartOf property value.<p>
     * 
     * @return true if there is a isPartOf property value.
     */
    boolean hasIsPartOf();

    /**
     * Adds a isPartOf property value.<p>
     * 
     * @param newIsPartOf the isPartOf property value to be added
     */
    void addIsPartOf(Place newIsPartOf);

    /**
     * Removes a isPartOf property value.<p>
     * 
     * @param oldIsPartOf the isPartOf property value to be removed.
     */
    void removeIsPartOf(Place oldIsPartOf);


    /* ***************************************************
     * Property http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#overlaps
     */
     
    /**
     * Gets all property values for the overlaps property.<p>
     * 
     * @returns a collection of values for the overlaps property.
     */
    Collection<? extends Place> getOverlaps();

    /**
     * Checks if the class has a overlaps property value.<p>
     * 
     * @return true if there is a overlaps property value.
     */
    boolean hasOverlaps();

    /**
     * Adds a overlaps property value.<p>
     * 
     * @param newOverlaps the overlaps property value to be added
     */
    void addOverlaps(Place newOverlaps);

    /**
     * Removes a overlaps property value.<p>
     * 
     * @param oldOverlaps the overlaps property value to be removed.
     */
    void removeOverlaps(Place oldOverlaps);


    /* ***************************************************
     * Property http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#touches
     */
     
    /**
     * Gets all property values for the touches property.<p>
     * 
     * @returns a collection of values for the touches property.
     */
    Collection<? extends Place> getTouches();

    /**
     * Checks if the class has a touches property value.<p>
     * 
     * @return true if there is a touches property value.
     */
    boolean hasTouches();

    /**
     * Adds a touches property value.<p>
     * 
     * @param newTouches the touches property value to be added
     */
    void addTouches(Place newTouches);

    /**
     * Removes a touches property value.<p>
     * 
     * @param oldTouches the touches property value to be removed.
     */
    void removeTouches(Place oldTouches);


    /* ***************************************************
     * Property http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#wikipediaArticle
     */
     
    /**
     * Gets all property values for the wikipediaArticle property.<p>
     * 
     * @returns a collection of values for the wikipediaArticle property.
     */
    Collection<? extends WikipediaArticle> getWikipediaArticle();

    /**
     * Checks if the class has a wikipediaArticle property value.<p>
     * 
     * @return true if there is a wikipediaArticle property value.
     */
    boolean hasWikipediaArticle();

    /**
     * Adds a wikipediaArticle property value.<p>
     * 
     * @param newWikipediaArticle the wikipediaArticle property value to be added
     */
    void addWikipediaArticle(WikipediaArticle newWikipediaArticle);

    /**
     * Removes a wikipediaArticle property value.<p>
     * 
     * @param oldWikipediaArticle the wikipediaArticle property value to be removed.
     */
    void removeWikipediaArticle(WikipediaArticle oldWikipediaArticle);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}