/*
 * Copyright 2018 Feedzai
 *
 * This software is licensed under the Apache License, Version 2.0 (the "Apache License") or the GNU
 * Lesser General Public License version 3 (the "GPL License"). You may choose either license to govern
 * your use of this software only upon the condition that you accept all of the terms of either the Apache
 * License or the LGPL License.
 *
 * You may obtain a copy of the Apache License and the LGPL License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0.txt
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Apache License
 * or the LGPL License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the Apache License and the LGPL License for the specific language governing
 * permissions and limitations under the Apache License and the LGPL License.
 *
 */

package com.feedzai.openml.r;

/**
 * Enumeration with the name of the objects created in a workspace of R by the generic R provider.
 *
 * @author Paulo Pereira (paulo.pereira@feedzai.com)
 * @since 0.1.0
 */
public enum ProviderRObject {
    /**
     * Name of the variable used in R to refer to the Caret model.
     */
    MODEL_VARIABLE("model"),
    /**
     * Name of the function used in R to load a model.
     */
    LOAD_MODEL_FN("loadModel"),
    /**
     * Name of the function used in R to classify an instance in the model and get the class distribution.
     */
    CLASS_DISTRIBUTION_FN("getClassDistribution"),
    /**
     * Name of the function used in R to classify an instance in the model and get the predicted class.
     */
    CLASSIFICATION_FN("classify");

    /**
     * Name of the object.
     */
    private final String name;

    /**
     * Constructor of the object.
     *
     * @param name Name of the object.
     */
    ProviderRObject(final String name) {
        this.name = name;
    }

    /**
     * Gets the name of the R object.
     *
     * @return the name of the object.
     */
    public String getName() {
        return this.name;
    }
}
