/**
 * Copyright (C) 2014
 * by 52 North Initiative for Geospatial Open Source Software GmbH
 *
 * Contact: Andreas Wytzisk
 * 52 North Initiative for Geospatial Open Source Software GmbH
 * Martin-Luther-King-Weg 24
 * 48155 Muenster, Germany
 * info@52north.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.envirocar.analyse;

import java.util.List;

import org.envirocar.analyse.entities.Point;

public interface PointService {
	
	Point aggregate(Point point, Point aggregationPoint, String trackId);

	/**
	 * @param point the relating point
	 * @param distance the maximum distance in meters
	 * @return
	 */
	Point getNearestNeighbor(Point point, double distance);

	void addToResultSet(Point newPoint);
	
	boolean updateResultSet(String idOfPointToBeReplaced, Point replacementPoint);

	List<Point> getResultSet();

	boolean isFitForAggregation(Point nextPoint);

	boolean trackAlreadyAggregated(String trackId);

	boolean insertTrackIntoAggregatedTracksTable(String trackId);
	
}
