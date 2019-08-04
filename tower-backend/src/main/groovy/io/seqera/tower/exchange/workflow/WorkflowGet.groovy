/*
 * Copyright (c) 2019, Seqera Labs.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * This Source Code Form is "Incompatible With Secondary Licenses", as
 * defined by the Mozilla Public License, v. 2.0.
 */

package io.seqera.tower.exchange.workflow


import io.seqera.tower.domain.WorkflowMetrics
import io.seqera.tower.domain.Workflow
import io.seqera.tower.exchange.progress.ProgressData

class WorkflowGet {

    Workflow workflow
    ProgressData progress
    @Deprecated List<WorkflowMetrics> metrics

    static WorkflowGet of(Workflow workflow) {
        new WorkflowGet(workflow: workflow)
    }

}
