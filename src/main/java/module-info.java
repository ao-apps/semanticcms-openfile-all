/*
 * semanticcms-openfile-all - Convenience POM to include most SemanticCMS OpenFile features, not including documentation or examples.
 * Copyright (C) 2021, 2022  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-openfile-all.
 *
 * semanticcms-openfile-all is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-openfile-all is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-openfile-all.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.semanticcms.openfile.all {
  // Direct
  requires transitive com.semanticcms.openfile.servlet; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-servlet</artifactId>
  requires transitive com.semanticcms.openfile.taglib; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-taglib</artifactId>
}
