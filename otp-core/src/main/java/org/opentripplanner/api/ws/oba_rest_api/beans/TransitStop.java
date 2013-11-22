/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.api.ws.oba_rest_api.beans;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.opentripplanner.routing.core.TraverseMode;

import java.util.Collection;

@Data
public class TransitStop {
    private String id;
    private double lat;
    private double lon;
    private String name;
    private String code;
    private String direction;
	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private String description;
    private int locationType;
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private String parentStation;
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private TraverseMode type;
    private Boolean wheelchairBoarding;
    private Collection<String> routeIds;
	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	private Collection<String> alertIds;
}
