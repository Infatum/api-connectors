# coding: utf-8

"""
    Bybit API

    ## REST API for the Bybit Exchange.   # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: support@bybit.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class TradeRecordsInfo(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'closed_size': 'float',
        'cross_seq': 'float',
        'exec_fee': 'str',
        'exec_id': 'str',
        'exec_price': 'str',
        'exec_qty': 'float',
        'exec_time': 'str',
        'exec_type': 'str',
        'exec_value': 'str',
        'fee_rate': 'str',
        'last_liquidity_ind': 'str',
        'leaves_qty': 'float',
        'nth_fill': 'float',
        'order_id': 'str',
        'order_price': 'str',
        'order_qty': 'float',
        'order_type': 'str',
        'side': 'str',
        'symbol': 'str',
        'user_id': 'float'
    }

    attribute_map = {
        'closed_size': 'closed_size',
        'cross_seq': 'cross_seq',
        'exec_fee': 'exec_fee',
        'exec_id': 'exec_id',
        'exec_price': 'exec_price',
        'exec_qty': 'exec_qty',
        'exec_time': 'exec_time',
        'exec_type': 'exec_type',
        'exec_value': 'exec_value',
        'fee_rate': 'fee_rate',
        'last_liquidity_ind': 'last_liquidity_ind',
        'leaves_qty': 'leaves_qty',
        'nth_fill': 'nth_fill',
        'order_id': 'order_id',
        'order_price': 'order_price',
        'order_qty': 'order_qty',
        'order_type': 'order_type',
        'side': 'side',
        'symbol': 'symbol',
        'user_id': 'user_id'
    }

    def __init__(self, closed_size=None, cross_seq=None, exec_fee=None, exec_id=None, exec_price=None, exec_qty=None, exec_time=None, exec_type=None, exec_value=None, fee_rate=None, last_liquidity_ind=None, leaves_qty=None, nth_fill=None, order_id=None, order_price=None, order_qty=None, order_type=None, side=None, symbol=None, user_id=None):  # noqa: E501
        """TradeRecordsInfo - a model defined in Swagger"""  # noqa: E501

        self._closed_size = None
        self._cross_seq = None
        self._exec_fee = None
        self._exec_id = None
        self._exec_price = None
        self._exec_qty = None
        self._exec_time = None
        self._exec_type = None
        self._exec_value = None
        self._fee_rate = None
        self._last_liquidity_ind = None
        self._leaves_qty = None
        self._nth_fill = None
        self._order_id = None
        self._order_price = None
        self._order_qty = None
        self._order_type = None
        self._side = None
        self._symbol = None
        self._user_id = None
        self.discriminator = None

        if closed_size is not None:
            self.closed_size = closed_size
        if cross_seq is not None:
            self.cross_seq = cross_seq
        if exec_fee is not None:
            self.exec_fee = exec_fee
        if exec_id is not None:
            self.exec_id = exec_id
        if exec_price is not None:
            self.exec_price = exec_price
        if exec_qty is not None:
            self.exec_qty = exec_qty
        if exec_time is not None:
            self.exec_time = exec_time
        if exec_type is not None:
            self.exec_type = exec_type
        if exec_value is not None:
            self.exec_value = exec_value
        if fee_rate is not None:
            self.fee_rate = fee_rate
        if last_liquidity_ind is not None:
            self.last_liquidity_ind = last_liquidity_ind
        if leaves_qty is not None:
            self.leaves_qty = leaves_qty
        if nth_fill is not None:
            self.nth_fill = nth_fill
        if order_id is not None:
            self.order_id = order_id
        if order_price is not None:
            self.order_price = order_price
        if order_qty is not None:
            self.order_qty = order_qty
        if order_type is not None:
            self.order_type = order_type
        if side is not None:
            self.side = side
        if symbol is not None:
            self.symbol = symbol
        if user_id is not None:
            self.user_id = user_id

    @property
    def closed_size(self):
        """Gets the closed_size of this TradeRecordsInfo.  # noqa: E501


        :return: The closed_size of this TradeRecordsInfo.  # noqa: E501
        :rtype: float
        """
        return self._closed_size

    @closed_size.setter
    def closed_size(self, closed_size):
        """Sets the closed_size of this TradeRecordsInfo.


        :param closed_size: The closed_size of this TradeRecordsInfo.  # noqa: E501
        :type: float
        """

        self._closed_size = closed_size

    @property
    def cross_seq(self):
        """Gets the cross_seq of this TradeRecordsInfo.  # noqa: E501


        :return: The cross_seq of this TradeRecordsInfo.  # noqa: E501
        :rtype: float
        """
        return self._cross_seq

    @cross_seq.setter
    def cross_seq(self, cross_seq):
        """Sets the cross_seq of this TradeRecordsInfo.


        :param cross_seq: The cross_seq of this TradeRecordsInfo.  # noqa: E501
        :type: float
        """

        self._cross_seq = cross_seq

    @property
    def exec_fee(self):
        """Gets the exec_fee of this TradeRecordsInfo.  # noqa: E501


        :return: The exec_fee of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._exec_fee

    @exec_fee.setter
    def exec_fee(self, exec_fee):
        """Sets the exec_fee of this TradeRecordsInfo.


        :param exec_fee: The exec_fee of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._exec_fee = exec_fee

    @property
    def exec_id(self):
        """Gets the exec_id of this TradeRecordsInfo.  # noqa: E501


        :return: The exec_id of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._exec_id

    @exec_id.setter
    def exec_id(self, exec_id):
        """Sets the exec_id of this TradeRecordsInfo.


        :param exec_id: The exec_id of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._exec_id = exec_id

    @property
    def exec_price(self):
        """Gets the exec_price of this TradeRecordsInfo.  # noqa: E501


        :return: The exec_price of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._exec_price

    @exec_price.setter
    def exec_price(self, exec_price):
        """Sets the exec_price of this TradeRecordsInfo.


        :param exec_price: The exec_price of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._exec_price = exec_price

    @property
    def exec_qty(self):
        """Gets the exec_qty of this TradeRecordsInfo.  # noqa: E501


        :return: The exec_qty of this TradeRecordsInfo.  # noqa: E501
        :rtype: float
        """
        return self._exec_qty

    @exec_qty.setter
    def exec_qty(self, exec_qty):
        """Sets the exec_qty of this TradeRecordsInfo.


        :param exec_qty: The exec_qty of this TradeRecordsInfo.  # noqa: E501
        :type: float
        """

        self._exec_qty = exec_qty

    @property
    def exec_time(self):
        """Gets the exec_time of this TradeRecordsInfo.  # noqa: E501


        :return: The exec_time of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._exec_time

    @exec_time.setter
    def exec_time(self, exec_time):
        """Sets the exec_time of this TradeRecordsInfo.


        :param exec_time: The exec_time of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._exec_time = exec_time

    @property
    def exec_type(self):
        """Gets the exec_type of this TradeRecordsInfo.  # noqa: E501


        :return: The exec_type of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._exec_type

    @exec_type.setter
    def exec_type(self, exec_type):
        """Sets the exec_type of this TradeRecordsInfo.


        :param exec_type: The exec_type of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._exec_type = exec_type

    @property
    def exec_value(self):
        """Gets the exec_value of this TradeRecordsInfo.  # noqa: E501


        :return: The exec_value of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._exec_value

    @exec_value.setter
    def exec_value(self, exec_value):
        """Sets the exec_value of this TradeRecordsInfo.


        :param exec_value: The exec_value of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._exec_value = exec_value

    @property
    def fee_rate(self):
        """Gets the fee_rate of this TradeRecordsInfo.  # noqa: E501


        :return: The fee_rate of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._fee_rate

    @fee_rate.setter
    def fee_rate(self, fee_rate):
        """Sets the fee_rate of this TradeRecordsInfo.


        :param fee_rate: The fee_rate of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._fee_rate = fee_rate

    @property
    def last_liquidity_ind(self):
        """Gets the last_liquidity_ind of this TradeRecordsInfo.  # noqa: E501


        :return: The last_liquidity_ind of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._last_liquidity_ind

    @last_liquidity_ind.setter
    def last_liquidity_ind(self, last_liquidity_ind):
        """Sets the last_liquidity_ind of this TradeRecordsInfo.


        :param last_liquidity_ind: The last_liquidity_ind of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._last_liquidity_ind = last_liquidity_ind

    @property
    def leaves_qty(self):
        """Gets the leaves_qty of this TradeRecordsInfo.  # noqa: E501


        :return: The leaves_qty of this TradeRecordsInfo.  # noqa: E501
        :rtype: float
        """
        return self._leaves_qty

    @leaves_qty.setter
    def leaves_qty(self, leaves_qty):
        """Sets the leaves_qty of this TradeRecordsInfo.


        :param leaves_qty: The leaves_qty of this TradeRecordsInfo.  # noqa: E501
        :type: float
        """

        self._leaves_qty = leaves_qty

    @property
    def nth_fill(self):
        """Gets the nth_fill of this TradeRecordsInfo.  # noqa: E501


        :return: The nth_fill of this TradeRecordsInfo.  # noqa: E501
        :rtype: float
        """
        return self._nth_fill

    @nth_fill.setter
    def nth_fill(self, nth_fill):
        """Sets the nth_fill of this TradeRecordsInfo.


        :param nth_fill: The nth_fill of this TradeRecordsInfo.  # noqa: E501
        :type: float
        """

        self._nth_fill = nth_fill

    @property
    def order_id(self):
        """Gets the order_id of this TradeRecordsInfo.  # noqa: E501


        :return: The order_id of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._order_id

    @order_id.setter
    def order_id(self, order_id):
        """Sets the order_id of this TradeRecordsInfo.


        :param order_id: The order_id of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._order_id = order_id

    @property
    def order_price(self):
        """Gets the order_price of this TradeRecordsInfo.  # noqa: E501


        :return: The order_price of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._order_price

    @order_price.setter
    def order_price(self, order_price):
        """Sets the order_price of this TradeRecordsInfo.


        :param order_price: The order_price of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._order_price = order_price

    @property
    def order_qty(self):
        """Gets the order_qty of this TradeRecordsInfo.  # noqa: E501


        :return: The order_qty of this TradeRecordsInfo.  # noqa: E501
        :rtype: float
        """
        return self._order_qty

    @order_qty.setter
    def order_qty(self, order_qty):
        """Sets the order_qty of this TradeRecordsInfo.


        :param order_qty: The order_qty of this TradeRecordsInfo.  # noqa: E501
        :type: float
        """

        self._order_qty = order_qty

    @property
    def order_type(self):
        """Gets the order_type of this TradeRecordsInfo.  # noqa: E501


        :return: The order_type of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._order_type

    @order_type.setter
    def order_type(self, order_type):
        """Sets the order_type of this TradeRecordsInfo.


        :param order_type: The order_type of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._order_type = order_type

    @property
    def side(self):
        """Gets the side of this TradeRecordsInfo.  # noqa: E501


        :return: The side of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._side

    @side.setter
    def side(self, side):
        """Sets the side of this TradeRecordsInfo.


        :param side: The side of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._side = side

    @property
    def symbol(self):
        """Gets the symbol of this TradeRecordsInfo.  # noqa: E501


        :return: The symbol of this TradeRecordsInfo.  # noqa: E501
        :rtype: str
        """
        return self._symbol

    @symbol.setter
    def symbol(self, symbol):
        """Sets the symbol of this TradeRecordsInfo.


        :param symbol: The symbol of this TradeRecordsInfo.  # noqa: E501
        :type: str
        """

        self._symbol = symbol

    @property
    def user_id(self):
        """Gets the user_id of this TradeRecordsInfo.  # noqa: E501


        :return: The user_id of this TradeRecordsInfo.  # noqa: E501
        :rtype: float
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this TradeRecordsInfo.


        :param user_id: The user_id of this TradeRecordsInfo.  # noqa: E501
        :type: float
        """

        self._user_id = user_id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(TradeRecordsInfo, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, TradeRecordsInfo):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
