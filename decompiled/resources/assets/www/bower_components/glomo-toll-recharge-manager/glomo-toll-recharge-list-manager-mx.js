class GlomoTollRechargeListManagerMx extends Polymer.mixinBehaviors([ CellsBehaviors.CellsCheckNestedKeysBehavior ], Polymer.Element) {

  static get is() {
    return 'glomo-toll-recharge-list-manager-mx';
  }

  static get properties() {
    return {
      /**
        * @desc Local currency
        * @type {String}
        */
      localCurrency: {
        type: String
      },
      /**
        * @desc list tags
        * @type {Object}
        */
      mappedTags: {
        type: Array,
        value: () => ([])
      },
      /**
       * @desc Id tag
       * @type {String}
       */
      idTag: {
        type: String
      },
      /**
       * @desc Set modal config items
       * @type {Object}
       */
      modalConfigItems: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Flag for first view
       * @type {Boolean}
       */
      firstView: {
        type: Boolean,
        value: true
      },
      /**
       * @desc Agreement number with the PASE service
       * @type {String}
       */
      agreementNumber: {
        type: String,
        value: '001783556'
      },
      /**
       * @desc bill number tag
       * @type {Number}
       */
      bills: {
        type: Number
      },
      /**
       * @desc previous tag list
       * @type {Object}
       */
      previousTag: {
        type: Object
      },
      /**
       * @desc force the petition into the Spanish language
       * @type {Object}
       */
      headers: {
        type: Object,
        value: { 'Accept-Language': 'es' }
      },
      /**
       * @desc number tag delete
       * @type {Number}
       */
      numberTag: {
        type: Number
      },
      /**
       * @desc Image about agreement
       * @type {Object}
       */
      images: {
        type: Object,
        value: () => ({
          logo: 'images/tagCard/pase.svg',
          logo2: 'images/tagCard/televia.svg'
        })
      },
      /**
       * @desc check the tag that is deleted
       * @type {String}
       */
      _deletedTag: {
        type: String,
        value: ''
      },
      /**
       * @desc check the tag that is deleted
       * @type {String}
       */
      _checktag: {
        type: String,
        value: ''
      },
      /**
       * @desc check if the user confirm the delete
       * @type {Boolean}
       */
      _confirmDelFromUser: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Feature flags
       * @type {Object}
       */
      featureFlags: { type: Object }
    };
  }

  /**
   * @Desc request service list
   */
  requestService() {
    this.openSpinner();
    this.$.apiPayments.getStoredServices();
  }
  /**
   * @desc Object to bring feature flags
   * @param {Object} flags
   */
  getFeatureFlagCollection(flags) {
    this.featureFlags = flags;
    this._dispatchEvent('feature-flags', this.featureFlags);
  }
  /**
   * @desc parse get /payments/v0/stored-services
   * @param {Object} detail
   */
  getServiceList(servicesList) {
    this.mappedTags = [];
    this.previousTag = [];
    let list = servicesList.detail;
    if (list === null) {
      this.set('firstView', true);
      this._firstView();
    } else {
      const isActivePase = this.featureFlags['glomo.operations.ServicePaymentTag']?.value ?? false;
      const isActiveTv = this.featureFlags['glomo.operations.servicePaymentTeleviaTag']?.value ?? false;
      const tagsListPase = isActivePase ? list
        .filter(item => (item.service.id === '001783556')) : [];
      const tagsListTelevía = isActiveTv ? list
        .filter(item => (item.service.id === '002036657')) : [];

      const tagsList = (tagsListPase.concat(tagsListTelevía)).map(item => {
        return {
          idTag: item.id,
          billNumber: item.billNumber,
          name: item.alias,
          agreement: item.service.id
        };
      });
      if (tagsList.length !== 0) {
        this._dispatchEvent('flag-type-exit-list', true);
        this.mappedTags = tagsList;
        this._requestAmountTag(tagsList);
      } else {
        this._dispatchEvent('flag-type-exit-list', false);
        this._firstView();
      }
      this.numberTag = tagsList.length;
    }
  }

  /**
   * @private Set mask bill number
   * @param {String} billNumber
   * @returns {String}
   */
  _setMask(billNumber) {
    return '•' + billNumber.substring(billNumber.length - 4, billNumber.length);
  }

  /**
   * @private request get /payments/v0/services/
   * @param {Object} mappedTags
   */
  _requestAmountTag(tagsList) {
    tagsList.forEach(element => {
      const actualtag = element.billNumber;
      this._checktag = actualtag;
      this.$.apiPayments.getBills(element.agreement, 'BILL_NUMBER', element.billNumber);
    });
  }

  /**
   * @Desc indicate the next page
   */
  routeCardInfo() {
    this._dispatchEvent('navigate-to-tag-card-info', {
      page: 'tagCardInfo'
    });
  }

  /**
   * @desc parse get /payments/v0/services/
   * @param {Object} payload
   */
  responseBills(payload) {
    let billNumber = this.get('detail.0.billNumber', payload);

    let tagsList = this.mappedTags
      .filter(complete => complete.billNumber === billNumber);

    if (!this.previousTag.some((tag) => tag.billNumber === billNumber)) {
      this.previousTag.push({
        contactId: this.get('detail.0.id', payload),
        name: this.get('0.name', tagsList),
        billNumber: this.get('detail.0.billNumber', payload),
        secondary: this._setMask(billNumber),
        currency: 'MXN',
        amount: this.get('detail.0.billAmounts.1.amountValue', payload),
        class: 'currency-xl balance_amount',
        text: 'pase-tag-card-list-label',
        image: tagsList[0].agreement === '001783556' ? this.get('logo', this.images) : this.get('logo2', this.images)
      });
    }
    this._dispatchEvent('prevent-duplicate-tag', this.previousTag);
    if (this.mappedTags.length === this.previousTag.length) {
      this._firstView();
    }
  }

  /**
   * @desc Initializes manager functionalities
   */
  _firstView() {
    if (this.previousTag && this.previousTag.length === 0) {
      if (this.firstView && this.numberTag === 1) {
        this.numberTag = 0;
        this._dispatchEvent('go-back-event');
        this._dispatchEvent('hidden-component-event', true);
      } else if (this.firstView) {
        this._dispatchEvent('navigate-to-register-tag-event');
      }
    } else {
      let statusComponent = this.previousTag.length === 10 ? true : false;
      this._dispatchEvent('hidden-icon-button-event', statusComponent);
      this._dispatchEvent('hidden-message-box-event', !statusComponent);
      this._dispatchEvent('hidden-component-event', false);
      this._dispatchEvent('show-empty-component-event', true);
      this._buildForceSetTag(this.previousTag);
      this._closeSpinner();
      this._dispatchEvent('got-tags-successfully');
      this.set('firstView', false);
    }
    this._closeSpinner();
  }

  _buildForceSetTag(previousTag) {
    let tagsList = [];
    tagsList.push({
      title: 'tag-card-list-title-list',
      list: previousTag
    });

    tagsList.sort();

    this._dispatchEvent('set-tags-event', tagsList);
  }

  /**
   * @desc Set config open modal
   * @event open-info-modal
   * @param {Object} detail
  */
  _showInfoModal(modal) {
    const modalItem = this.modalConfigItems[modal.id];
    const data = {
      code: modalItem.code,
      selectedConfig: {
        className: modalItem.className,
        openMaximized: modalItem.maximize,
        hideCloseIcon: modalItem.hideCloseIcon,
        iconOnlyFullHeight: true,
        closeOnPrimaryButton: modalItem.closeOnPrimaryButton,
        acceptBtLabel: modalItem.acceptBtLabel,
        onAcceptEvent: modalItem.onAcceptEvent,
        template: {
          type: 'paragraphs',
          values: modalItem.values
        }
      }
    };
    if (modalItem.title) {
      data.selectedConfig.title = modalItem.title;
    }
    if (modalItem.cancelBtLabel) {
      data.selectedConfig.cancelBtLabel = modalItem.cancelBtLabel;
      data.selectedConfig.onCancelEvent = modalItem.onCancelEvent;
    }

    if (modalItem.heroImage) {
      data.selectedConfig.heroImage = modalItem.heroImage;
    }
    this._dispatchEvent('open-info-modal', data);
  }

  /**
   * @desc Open modal confirm delete Tag
   * @event request-delete-tag-event
   * @param {Object} detail
   */
  modalConfirmDeleteTag(detail) {
    this.set('idTag', detail);
    let index = this.previousTag.findIndex(element => element.contactId === this.idTag);
    if (this.c(this.previousTag[index], 'billNumber').substring(0, 4) === 'OHLM' || this.c(this.previousTag[index], 'billNumber').substring(0, 3) === '099') {
      this.set('_deletedTag', 'televia');
    } else {
      this.set('_deletedTag', 'pase');
    }
    this._showInfoModal({
      id: 'confirm-delete-tag-modal'
    });
  }

  /**
   * @desc Request delete tag
   * @event request-delete-tag-event
   */
  confirmRequestDeleteTag() {
    this.openSpinner();
    this._confirmDelFromUser = true;
    this._dispatchEvent('request-delete-tag-event', this.idTag);
  }

  parseDataRecharge(idTag) {
    let index = this.previousTag.findIndex(element => element.contactId === idTag);
    this._dispatchEvent('navigate-to-recharge-event', this.previousTag[index]);
  }

  /**
   * @desc Show modal info delete tag
   * @event info-delete-tag
  */
  openModalDeleteTag() {
    this._showInfoModal({
      id: `info-delete-tag-${this._deletedTag}`
    });
  }

  /**
   * @desc Show modal info delete tag
   * @event retry-error
   */
  retryError() {
    const retryErrorData = {
      errorId: 'not-show-information',
      errorType: 'technicalError',
      retryConfig: {
        header: 'not-show-information-title',
        title: 'not-show-information-title-message',
        message: 'not-show-information-message',
        acceptBtLabel: 'not-show-information-exit',
        cancelBtLabel: 'not-show-information-call',
        srcImage: 'images/Connectivity.svg',
        fullModal: true,
      },
      callConfig: {
        header: 'not-show-information-title',
        title: 'not-show-information-title-message',
        message: 'not-show-information-message',
        srcImage: 'images/Connectivity.svg',
        acceptBtLabel: 'Salir',
        fullModal: true,
      }
    };
    this._closeSpinner();
    this._dispatchEvent('retry-error', Object.assign({ retryErrorData }));
  }

  /**
   * @desc Show modal info delete tag
   * @event response-error-list-service
  */
  responseErrorListService(payload) {
    let errorCode = this.c(payload, 'detail.error-code', this.c(payload, 'error-code', 'EIE0331'));
    let errorMessage = this.c(payload, 'detail.error-message', this.c(payload, 'error-message', 'errorGeneral'));
    let errorStatus = this.c(payload, 'detail.status', this.c(payload, 'status', 'errorGeneral'));
    if (errorMessage === 'ERROR: TAG CORPORATIVA- VERIFICAR') {
      const objchecktag = this.mappedTags.find(item => item.billNumber === this._checktag);
      this._confirmDelFromUser = false;
      const idToDel = this.c(objchecktag, 'idTag', '');
      this._dispatchEvent('request-delete-tag-event', idToDel);
    } else if (errorStatus !== 500) {
      this._dispatchEvent('response-error-list-service', {
        errorCode: errorCode,
        errorMessage: errorMessage
      });
    } else {
      this.retryError();
    }
  }

  /**
   * @desc validates if the tag deletion message should be displayed
   * @event set-open-toast
   */
  checkToastMessage() {
    if (this._confirmDelFromUser) {
      this._dispatchEvent('set-open-toast', true);
    }
  }

  /**
   * @desc Dispatch event to open spinner
   * @event open-control-veil
   */
  openSpinner() {
    this._dispatchEvent('open-control-veil');
  }

  /**
   * @desc Dispatch event to close spinner
   * @event close-control-veil
   */
  _closeSpinner() {
    this._dispatchEvent('close-control-veil');
  }

  /**
   * @desc Dispatch event to go back
  */
  goBack() {
    this._dispatchEvent('go-back-event');
    this._closeSpinner();
  }

  /**
   *
   * @desc recharge list tags
   */
  rechargeListTag() {
    this.previousTag = ({});
    this.requestService();
  }

  /**
   * @private Dispatches a custom event with name and detail
   * @param {String} nameParam
   * @param {any} detail
   */
  _dispatchEvent(nameParam, detail) {
    this.dispatchEvent(new CustomEvent(nameParam, {
      bubbles: true,
      composed: true,
      detail: detail
    }));
  }
}

customElements.define(GlomoTollRechargeListManagerMx.is, GlomoTollRechargeListManagerMx);