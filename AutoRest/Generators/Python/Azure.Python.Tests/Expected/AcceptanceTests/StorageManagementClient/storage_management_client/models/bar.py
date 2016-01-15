# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class Bar(Model):
    """The URIs that are used to perform a retrieval of a public blob, queue
    """or table object."""

    _required = []

    _attribute_map = {
        'recursive_point': {'key': 'RecursivePoint', 'type': 'Endpoints'},
    }

    def __init__(self, *args, **kwargs):
        """Bar

        :param Endpoints recursive_point: Recursive Endpoints
        """
        self.recursive_point = None

        super(Bar, self).__init__(*args, **kwargs)
