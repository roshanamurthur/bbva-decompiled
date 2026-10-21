// eslint-disable-next-line
/*global moment*/
class GlomoSpecialSalesDm extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsCheckNestedKeysBehavior
], Polymer.Element) {

  static get is() {
    return 'glomo-special-sales-dm';
  }
  static get properties() {
    return {
      /*
      * Property that saves the data for the request
      */
      dataPromotion: {
        type: Object,
        value: () => ({}),
      },
      /*
      * Property that saves the received data
      */
      participantCard: {
        type: Object,
      },
      /*
      * Property screen
      */
      totalHeight: {
        type: String,
        value: '1030',
      },

      /*
      * Property that saves the date of the operation
      */
      offersRetrieved: {
        type: Array,
        value: () => []
      },
      /*
      * Property that saves the card number
      */
      globalDashboardCards: {
        type: Array,
        value: () => []
      },
      /*
      * Property that saves the date of the operation
      */
      cardInfo: {
        type: Object,
        value: () => ({})
      },
      /*
      * Property that saves the card number
      */
      responseEnrollment: {
        type: Array,
        value: () => []
      },
      /*
      * Property that saves the date of the operation
      */
      offerStatus: {
        type: Boolean,
        value: false
      },
      /*
      * Property that saves the date of the operation
      */
      iosFlag: {
        type: Boolean,
        value: false
      },
    };
  }

  /*
  * Method that receives the data and sets it
  */
  setDataPromotion(param) {
    this.set('dataPromotion', param);
    localStorage.setItem('participantCard', JSON.stringify(param));
  }


  /*
  * Events spinner
  */
  _hideSpinner() {
    this._dispatch('hide-spinner-event');
  }

  _showSpinner() {
    this._dispatch('show-spinner-event');
  }

  /*
  Public method to control navigation on page
  */
  userHasCancel() {
    this._dispatch('close-special-modal', true);
    this._dispatch('back-step-action', true);
  }

  /*
  * Public method to control navigation on page
  * @event back-to-dashboard
  */
  backToDashboard() {
    this._dispatch('back-to-dashboard', true);
  }

  /*
  * Generic function to fire an event
  */
  _dispatch(eventName, detail) {
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail
    }));
  }

  /*
  * Promotion detail screen
  */
  _specialSales() {
    this._showSpinner();
    let specialSalesPage = {
      code: 'special-sales',
      opened: true,
      selectedConfig: {
        className: 'full-height-error',
        heroImage: './images/star.svg',
        openMaximized: true,
        iconOnlyFullHeight: undefined,
        title: 'special-header-text',
        acceptBtLabel: 'special-button-continue',
        onAcceptEvent: '',
        cancelBtLabel: 'special-button-exit',
        onCancelEvent: '',
        template: {
          type: 'paragraphs',
          values: [{
            class: 'spacing'
          },
          {
            title: this.c(this.dataPromotion, this.iosFlag  ? 'variables_Message_title' : 'notificationType'),
            class: 'simple-title'
          },
          {
            text: this.c(this.dataPromotion, this.iosFlag ? 'variables_Message_messageBody' : 'messageBody'),
          },
          {
            text: 'special-info-terms-text',
          }],
        }
      }
    };
    this.dispatchEvent(new CustomEvent('special-sales', {
      detail: specialSalesPage
    }));
  }

  /*
  * Method to get the list of offers
  + @param {Object} infoPush
  */
  getListOffers(infoPush) {
    this.dataPromotion = infoPush;
    this._dispatch('get-list-offers');
  }

  /*
  * Method to get the list of offers
  + @param {Object} infoPush
  */
  listOffersResponse(data) {
    this.offerStatus = true;
    this.cardInfo = data;
    if (Object.keys(this.cardInfo).length === 0) {
      this.specialSalesError();
    } else {
      this._specialSales();
    }
  }

  /*
  * Method to get the list of offers
  */
  responseSetOfferList() {
    if (!this.offerStatus) {
      this.specialSalesError();
    }
  }

  errorResponsePostRequest(error) {
    this._hideSpinner();
    this.dispatchEvent(new CustomEvent('show-modal-error-post-response', {
      detail: error,
      bubbles: true,
      composed: true
    }));
  }

  onSuccessResponsePostRequest(data) {
    this._hideSpinner();
    this._dispatch('set-data-promotion', this.dataPromotion);
    this._dispatch('set-card-info', this.cardInfo);
    this._dispatch('show-modal-success-post-response', {
      detail: data,
      bubbles: true,
      composed: true
    });
  }

  /*
  * Send the data for the request
  */
  setPostRequest() {
    this.dispatchEvent(new CustomEvent('set-params-request', {
      detail: {
        cardId: this.cardInfo.product.contractId,
        offerId: this.cardInfo.id
      },
      bubbles: true,
      composed: true
    }));
    this.dispatchEvent(new CustomEvent('set-body-request', {
      detail: {
        'code': this.iosFlag ? this.dataPromotion.variables_Message_codeEnrollment : this.dataPromotion.variables_message_codeEnrollment
      },
      bubbles: true,
      composed: true
    }));
  }

  /*
  * Abandon confirmation modal page
  */
  openModalConfirm() {
    this._hideSpinner();
    let specialSalesModalPage = {
      code: 'special-sales-modal',
      selectedConfig: {
        className: 'info',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'special-modal-button-exit',
        cancelBtLabel: 'special-modal-button-continue',
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:help', iconClass: 'icon-size-22 light-blue' },
            { title: 'special-modal-title', class: 'simple-title' },
            { text: 'special-modal-info-message', class: 'grey' }
          ]
        }
      }
    };
    this.dispatchEvent(new CustomEvent('special-sales-modal', {
      detail: specialSalesModalPage
    }));
  }

  /*
  * Error modal page
  */
  specialSalesError(error) {
    this._hideSpinner();
    let specialSalesModalErrorPage = '';
    const errorMessage = error?.messages[0]?.message;
    if (errorMessage === 'WZE0094#ENROL. O BENEF. YA SELECCIONADO') {
      specialSalesModalErrorPage = {
        code: 'special-sales-modal-error',
        selectedConfig: {
          className: 'error',
          openMaximized: false,
          iconOnlyFullHeight: true,
          acceptBtLabel: 'special-modal-button-exit',
          template: {
            type: 'paragraphs',
            values: [
              { icon: 'coronita:alert', iconClass: 'icon-size-22' },
              { title: 'special-modal-error-title-enrollment', class: 'simple-title' },
              { text: 'special-modal-error-message-enrollment', class: 'grey' }
            ]
          }
        }
      };
    } else {
      specialSalesModalErrorPage = {
        code: 'special-sales-modal-error',
        selectedConfig: {
          className: 'error',
          openMaximized: false,
          iconOnlyFullHeight: true,
          acceptBtLabel: 'special-modal-button-exit',
          cancelBtLabel: 'special-modal-button-retry',
          template: {
            type: 'paragraphs',
            values: [
              { icon: 'coronita:alert', iconClass: 'icon-size-22' },
              { title: 'special-modal-error-title', class: 'simple-title' },
              { text: 'special-modal-error-message', class: 'grey' }
            ]
          }
        }
      };
    }
    this.dispatchEvent(new CustomEvent('special-sales-modal-error', {
      detail: specialSalesModalErrorPage
    }));
  }

  /*
  * Method to get the card information
  * @param {Object} data
  */
  getCardInfo(data) {
    this.responseEnrollment = data.detail;
    this._dispatch('set-card-id', this.cardInfo.product.contractId);
    this._dispatch('get-request-card-data');
  }

  /*
  * Method to get the card information
  * @param {String} data
  */
  _extractToNumber(number) {
    return number.substring(number.length - 4, number.length);
  }

  /*
  * Success page
  */
  specialSalesSuccess(data) {
    this._hideSpinner();
    if (this.responseEnrollment.message === 'ENROLAMIENTO EXITOSO') {
      const enrolledCampaign = this.c(this.responseEnrollment, 'enrolledCampaign');
      let keyPeriod = enrolledCampaign.validityPeriod ? 'special-success-validity-date' : '';
      let valuePeriod = enrolledCampaign.validityPeriod ? this.c(this.responseEnrollment, 'enrolledCampaign.validityPeriod.startDate') + ' al ' + this.c(this.responseEnrollment, 'data.enrolledCampaign.validityPeriod.endDate') : '';
      let classPeriod = enrolledCampaign.validityPeriod ? 'light-key' : 'spacing';

      let result = {
        mainIcon: {
          src: './images/success.svg',
          info: 'Operation Success'
        },
        mainTitle: {
          key: 'special-success-title',
          value: '',
          class: 'bold'
        },
        additionalInfo: [
          {
            value: 'special-success-info-subtext',
            class: 'light-key'
          },
          {
            key: '',
            class: 'spacing'
          },
          {
            value: this._getData(this.responseEnrollment.operationDate),
            class: 'bold spacing date'
          },
          {
            key: 'special-success-info-card',
            value: data ? data.alias : '',
            class: 'light-key'
          },
          {
            value: '•' + data ? this._extractToNumber(data.number) : '',
            class: 'light-key'
          },
          {
            key: '',
            class: 'spacing'
          },
          {
            key: 'special-success-promotion',
            value: this.c(this.responseEnrollment, 'enrolledCampaign.name'),
            class: 'light-key'
          },
          {
            key: '',
            class: 'spacing'
          },
          {
            key: keyPeriod,
            value: valuePeriod,
            class: classPeriod
          },
          {
            key: '',
            class: 'spacing'
          },
          {
            key: 'special-success-operation-number',
            value: this.c(this.responseEnrollment, 'operationTracking.operationNumber'),
            class: 'light-key'
          },
          {
            value: 'special-success-operation-text',
            class: 'light-key'
          },
          {
            key: '',
            class: 'spacing'
          },
          {
            message: {
              type: 'info',
              text: 'special-success-info-text',
              icon: 'coronita:info',
              iconSize: {
                width: 22,
                height: 22
              }
            },
          }
        ]
      };
      this.dispatchEvent(new CustomEvent('special-sales-success', {
        detail: result,
        bubbles: true,
        composed: true
      }));
    } else {
      this._dispatch('special-sales-success-error');
    }
  }

  /*
  * Date conversion function
  */
  _getData(date) {
    var t = date.split(/[- : T]/);
    var d = new Date(t[0], t[1] - 1, t[2], t[3], t[4], t[5]);
    var time = new Date(d);
    const minutes = ('0' + time.getMinutes()).slice(-2);
    let timeLocal = `${moment(date).format('DD MMMM YYYY')}, ${time.getHours()}:${ minutes } h`;
    return timeLocal;
  }

  //= = = = = = = = = = = = = = = = = = = = = =
  // SHARE
  //= = = = = = = = = = = = = = = = = = = = = =
  /**
  * Launch the modal to eliminate the turn
  * @event share-receipt-capture
  */
  share() {
    this.dispatchEvent(new CustomEvent('share-receipt-capture', {
      bubbles: true,
      composed: true,
      detail: {
        height: this.totalHeight,
        share: true
      }
    }));
  }
}

customElements.define(GlomoSpecialSalesDm.is, GlomoSpecialSalesDm);
