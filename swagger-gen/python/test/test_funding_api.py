# coding: utf-8

"""
    Bybit API

    ## REST API for the Bybit Exchange.   # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: support@bybit.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.funding_api import FundingApi  # noqa: E501
from swagger_client.rest import ApiException


class TestFundingApi(unittest.TestCase):
    """FundingApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.funding_api.FundingApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_funding_get_rate(self):
        """Test case for funding_get_rate

        Funding settlement occurs every 8 hours at 00:00 UTC, 08:00 UTC and 16:00 UTC. The current interval's fund fee settlement is based on the previous interval's fund rate. For example, at 16:00, the settlement is based on the fund rate generated at 8:00. The fund rate generated at 16:00 will be used at 0:00 on the next day.  # noqa: E501
        """
        pass

    def test_funding_predicted(self):
        """Test case for funding_predicted

        Get predicted funding rate and funding fee.  # noqa: E501
        """
        pass

    def test_funding_predicted_rate(self):
        """Test case for funding_predicted_rate

        Get predicted funding rate and funding fee.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
