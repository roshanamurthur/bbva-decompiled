/*global moment*/
class GlomoTagCardRegisterDmMx extends Polymer.mixinBehaviors([CellsBehaviors.i18nBehavior, CellsBehaviors.CellsCheckNestedKeysBehavior], Polymer.Element) {

  static get is() {
    return 'glomo-tag-card-register-dm-mx';
  }

  static get properties() {
    return {
      /**
       * @desc Address to request api's with BGADP
       * @type {String}
       * */
      host: String,
      /**
       * cache storage to reduce network calls
       * @type {Object}
       */
      globalCacheStorage: {
        type: Object,
        value: () => ({})
      },
      /**
       * pdf configuration
       * @type {Object}
       */
      detailDownloadConfig: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc requiredToken to request api's with BGADP
       * @type {Object}
       */
      requiredToken: {
        type: Object,
        notify: true
      },
      /**
       * @desc native to request api's with BGADP
       * @type {Object}
       * */
      native: {
        type: Object,
        notify: true
      },
      /**
       * @desc paymentsApiVersion to request api's with BGADP
       * @type {Object}
       */
      paymentsApiVersion: {
        type: String,
        notify: true
      },
      /**
       * @desc Config for offer page
       * @type {Object}
       */
      offerPageConfigState: {
        type: Object,
        notify: true,
        value: () => ([])
      },
      /**
       * @desc Set message spinner
       * @type {Array}
       */
      messageSpinner: {
        type: Array,
        notify: true,
        value: () => ([])
      },
      /**
       * @desc Obtain information tag
       * @type {Array}
       */
      informationTag: {
        type: Array,
        values: () => ([])
      },
      /**
       * @desc Modal config items
       * @type {Object}
       */
      modalConfigs: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Modal config items
       * @type {Object}
       */
      infoTagLabels: {
        type: Object,
        value: () => ({
          alias: 'Alias',
          number: 'Número de tag',
          numberDigits: 'Número: 9 dígitos',
          numberTag: 'Número de tag',
          onlyNumber: 'Número',
          prefix: 'Prefijo',
          balance: 'Saldo',
          currentBalance: 'Saldo actual',
          manualRegister: 'Registrar manualmente',
          scanBarCode: 'Capturar código de barras',
          scanLabel: 'Escanear código de barras',
          share: 'Compartir',
          successRegister: 'Registro exitoso',
          operationType: 'Tipo de operación',
          register: 'Alta de Tag',
          operador: '',
          agreement: '',
          recharge: 'Recargar Tag',
          numberErrorMessage: 'Sólo 9 dígitos',
          manualReg: 'manually',
          scanReg: 'scan',
          inline: 'inline text-normal',
          currency: 'MXN',
          custError: 'Sign operation cancelled by user'
        })
      },
      /** @desc format used on accounts by terms and conditions
       * @type {Object}
       */
      muskFormat: {
        type: Object,
        value: () => ({
          chars: 15,
          symbol: '•'
        })
      },
      /**
       * @desc specifies the kind of register
       * @type {String}
       */
      registerType: {
        type: String,
        value: 'scan',
        notify: true
      },
      /**
       * @desc info tag information
       * @type {Object}
       */
      infoTag: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc coronita icons list
       * @type {Object}
       */
      icons: {
        type: Object,
        value: () => ({
          info: 'coronita:info',
          alert: 'coronita:alert',
          share: 'coronita:share',
          dollar: 'coronita:dollar'
        })
      },
      /** @desc tsec for pdf request @type {Object} */
      tsec: {
        type: String,
        notify: true
      },
      /**
       * @desc device id for pdf request
       * @type {String}
       * */
      deviceId: {
        type: String,
        notify: true,
        value: ''
      },
      /**
       * @desc Accepts base64 string or pdf url
       * @type {string}
       * */
      baseSrc: {
        type: String,
        notify: true,
        value: ''
      },
      /**
       * @desc send the title value to modal
       * @type {String}
       * */
      docTitle: {
        type: String,
        notify: true,
        value: ''
      },
      /**
       * @desc total height
       * @type {String}
       */
      totalHeight: {
        type: String,
        value: '1000'
      },
      /** @desc Phone numbers @type {Object} */
      PHONE_NUMBERS: {
        type: Object,
        value: () => ({
          pase: '5559502500',
          bbva: '5552262663'
        })
      },
      /**
       * @desc Payload to open recharge page
       * @type {Object}
       */
      rechargePagePayload: {
        type: Object,
        value: () => ({})
      },
      /**
       * Show native channel data
       * @type Boolean
       */
      scanClicked: {
        type: Boolean,
        value: false
      },
      /**
      *@Desc Content value for alias input
      */
      valueAlias: {
        type: String,
        value: ''
      },
      /**
       * Code reader type id
       * @type {String}
       */
      codeType: {
        type: String,
        value: ''
      },
      /**
       * Camera reader result event name
       * @type {String}
       */
      resultEvent: {
        type: String,
        value: 'glomo-camera-code-reader-result'
      },
      /**
       * Camera reader error event name
       * @type {String}
       */
      errorEvent: {
        type: String,
        value: 'glomo-camera-code-reader-error'
      },
      /**
      *@Desc Content value for value
      */
      eventValueTag: {
        type: String,
        value: 'value'
      },
      /**
      *@Desc Content value for prefix
      */
      eventPrefixTag: {
        type: String,
        value: 'itemSelected'
      },
      /**
      *@Desc Content value for number
      */
      identifyTag: {
        type: String,
        value: 'value'
      },
      /**
       * Id document pdf
       * @type String
       */
      documentId: {
        type: String,
        value: 'GMDTCPT001'
      },
      /**
      * Type Event validationAgreement
      * @type {string}
      */
      validationAgreement: {
        type: String,
        value: '',
      },
      /**
      * Type Event validationOperador
      * @type {string}
      */
      validationOperador: {
        type: String,
        value: '',
      },
      /**
       * Validate register data
       * @type Boolean
       */
      registerClicked: {
        type: Boolean,
        value: false
      },
      /**
     * Amount tags max
     * @type Number
     */
      amountValueTag: {
        type: Number,
        value: 5
      },
      /**
       * Amount tags max
       * @type Object
       */
      radioButtonSelected: {
        type: Object,
        value: () => ({})
      },
      /**
       * Agreement tags
       * @type Object
       */
      agreement: {
        type: Object,
        value: () => ({
          pase: '001783556',
          televia: '002036657'
        })
      },
      /**
       * Format for date birthdate
       * @type {String}
       */
      formatDate: {
        type: String,
        value: 'DD MMMM YYYY'
      },
      /**
       * Format for date in successs
       * @type {String}
       */
      formatDateSuccess: {
        type: String,
        value: 'DD MMMM YYYY HH:MM'
      },
      /**
       * @desc show accounts
       * @type {String}
       */
      financialData: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Account selected to pay
       * @type {Object}
       */
      accountSelected: {
        type: Object
      },
      /**
       * @desc save the scanner configuration
       * @type {Object}
       */
      qrPluginConfigs: {
        type: Object
      },
      /**
       * @desc difference in what technology the app is in
       * @type {Object}
       */
      selectedPluginConfig: {
        type: String
      },
      /**
       * @desc save the metadata for backup
       * @type {Object}
       */
      termType: {
        type: Object,
        value: () => ({
          pase: 'BD-MX-AA-REGTAG-001',
          televia: 'BD-MX-AA-RTAGTE-001'
        })
      },
      /**
       * @desc business document parameters
       * @type {Object}
       */
      acceptanceMessage: {
        type: Object,
        value: () => ({
          pase: 'glomo-tag-card-register-dm-acceptance-message-pase',
          televia: 'BDTAGTEL01'
        })
      },
      /**
       * @desc check what configuration it occupies
       * @type {String}
       */
      isLocal: {
        type: String
      },
      /**
       * @desc specifies the device view
       * @type {String}
       */
      nativeView: {
        type: String
      },
      /**
       * flags for tag reload flows
       * @type {Object}
       */
      featureFlagTag: {
        type: Object,
        value: () => ({
          pase: 'glomo.operations.ServicePaymentTag',
          televia: 'glomo.operations.servicePaymentTeleviaTag'
        })
      }
    };
  }

  /**
  * Dispatch container list faqs
  * @param {String} code
  */
  containerFaqs() {
    let faqsListLevelOne =
      [{
        id: 1,
        title: this.t('bbva-widget-faqs-list-title-id-1'),
        alternativeTitle: this.t('bbva-widget-faqs-list-title-id-1'),
        answer: [ {
          type: 'p',
          content: [ this.t('bbva-widget-faqs-list-content-id-1') ]
        } ],
        header: {
          type: 'image',
          url: 'images/tagCard/faqs_tag_image.jpg'
        }
      },
      {
        id: 2,
        title: this.t('bbva-widget-faqs-list-title-id-2'),
        alternativeTitle: this.t('bbva-widget-faqs-list-title-id-2'),
        answer: [ {
          type: 'p',
          content: [ this.t('bbva-widget-faqs-list-content-id-2') ]
        } ],
        header: {
          type: 'image',
          url: 'images/tagCard/faqs_tag_image.jpg'
        }
      },
      {
        id: 3,
        title: this.t('bbva-widget-faqs-list-title-id-3'),
        alternativeTitle: this.t('bbva-widget-faqs-list-title-id-3'),
        answer: [ {
          type: 'p',
          content: [ this.t('bbva-widget-faqs-list-content-id-3') ]
        } ],
        header: {
          type: 'image',
          url: 'images/tagCard/faqs_tag_image.jpg'
        }
      },
      {
        id: 4,
        title: this.t('bbva-widget-faqs-list-title-id-4'),
        alternativeTitle: this.t('bbva-widget-faqs-list-title-id-4'),
        answer: [ {
          type: 'p',
          content: [ this.t('bbva-widget-faqs-list-content-id-4') ]
        } ],
        header: {
          type: 'image',
          url: 'images/tagCard/faqs_tag_image.jpg'
        }
      },
      {
        id: 5,
        title: this.t('bbva-widget-faqs-list-title-id-5'),
        alternativeTitle: this.t('bbva-widget-faqs-list-title-id-5'),
        answer: [ {
          type: 'p',
          content: [ this.t('bbva-widget-faqs-list-content-id-5') ]
        } ],
        header: {
          type: 'image',
          url: 'images/tagCard/faqs_tag_image.jpg'
        }
      },
      ];

    let faqsListLevelTwo =
      [{
        id: 6,
        title: this.t('bbva-widget-faqs-list-title-id-6'),
        alternativeTitle: this.t('bbva-widget-faqs-list-title-id-6'),
        answer: [ {
          type: 'p',
          content: [ this.t('bbva-widget-faqs-list-content-id-6') ]
        } ],
        header: {
          type: 'image',
          url: 'images/tagCard/faqs_tag_image.jpg'
        }
      },
      {
        id: 7,
        title: this.t('bbva-widget-faqs-list-title-id-7'),
        alternativeTitle: this.t('bbva-widget-faqs-list-title-id-7'),
        answer: [ {
          type: 'p',
          content: [ this.t('bbva-widget-faqs-list-content-id-7') ]
        } ],
        header: {
          type: 'image',
          url: 'images/tagCard/faqs_tag_image.jpg'
        }
      }];

    let faqsListLevelThree =
      [ {
        id: 8,
        title: this.t('bbva-widget-faqs-list-title-id-8'),
        alternativeTitle: this.t('bbva-widget-faqs-list-title-id-8'),
        answer: [ {
          type: 'p',
          content: [ this.t('bbva-widget-faqs-list-content-id-8') ]
        } ],
        header: {
          type: 'image',
          url: 'images/tagCard/faqs_tag_image.jpg'
        }
      } ];

    this._dispatchEvent('faqs-list-level-one', faqsListLevelOne);
    this._dispatchEvent('faqs-list-level-two', faqsListLevelTwo);
    this._dispatchEvent('faqs-list-level-three', faqsListLevelThree);
  }

  /**
   * @desc dispatch scan-event or manually-event
   * @param {Object} e
   */
  linkClicked(e) {
    if (e.id === this.get('manualReg', this.infoTagLabels)) {
      this._manuallyReadingTag();
    } else if (e.id === this.get('scanReg', this.infoTagLabels)) {
      this.set('scanClicked', true);
      this._dispatchEvent(e.id + '-event');
      this.openCameraCodeReader();
    }
  }

  /**
   * @desc Receive info tag from native
   * @param {Object} data
   */
  responseAutomaticReadingTag(tag) {
    if (this.scanClicked) {
      this.set('registerType', this.get('scanReg', this.infoTagLabels));
      if (tag.errorCode) {
        this._dispatchEvent('error-filter-event', tag.errorCode);
      } else {
        this._buildReadingInput(tag.prefixTag, tag.numberTag, 'scan');
        this._dispatchEvent('open-toast-modal-success');
      }
      this.set('scanClicked', false);
    }
  }

  /**
   * Sets data manager properties values
   * @param {Object} eventProp
   */
  setCameraCodeReaderManagerProperties(eventProp) {
    this.resultEvent = eventProp.resultEvent;
    this.errorEvent = eventProp.errorEvent;
    this.codeType = eventProp.codeType;
  }

  /**
  * Dispatch code camera reader result event
  * @param {String} code
  */
  cameraCodeReaderResult(code) {
    this.set('registerType', this.get('scanReg', this.infoTagLabels));
    let codeComplete = code.code.replace(/ *-*_*/g, '');
    let prefix = isNaN(parseInt(codeComplete.substring(0, 3))) ? codeComplete.substring(0, 4) : codeComplete.substring(0, 3);
    let numberPrefix = '';
    let regexValidNumber;
    let prefixPase = ['IMDM', 'CPFI', '005', '006'];
    let prefixTelevia = ['OHLM', '099'];

    if (prefixTelevia.includes(prefix)) {
      numberPrefix = isNaN(parseInt(prefix)) ? codeComplete.substring(4, 12) : codeComplete.substring(3, 11);
      regexValidNumber = /[0-9]{8}/;
    }

    if (prefixPase.includes(prefix)) {
      numberPrefix = isNaN(parseInt(prefix)) ? codeComplete.substring(4, 13) : codeComplete.substring(3, 12);
      regexValidNumber = /[0-9]{9}/;
    }

    let matches = numberPrefix.match(regexValidNumber);
    let validateNumber = matches !== null ? 'true' : 'false';

    let validation = prefixPase.concat(prefixTelevia).includes(prefix) ? 'Right' : 'Wrong';

    if (validation === 'Right' && validateNumber === 'true') {
      this._buildReadingInput(code.prefixTag, code.numberTag, 'scan');
      this._dispatchEvent('open-toast-modal-success');
      this._dispatchCustomEvent(this.eventPrefixTag, prefix);
      this._dispatchCustomEvent(this.eventValueTag, numberPrefix);
      this._dispatchCustomEvent('navigation-to-info-tag-event', this.registerType);
    } else {
      this._openNoIdentifierModal();
    }
  }

  /**
   * Dispatch open camera reader event
   */
  openCameraCodeReader() {
    const configScan = this.isLocal ? 'BARCODE' : Object.assign(this.qrPluginConfigs[this.selectedPluginConfig], {customViewConfig: {
      name: this.nativeView,
      options: {
        title: this.t('tag-register-scan-title')
      }
    }});
    this._dispatchCustomEvent('open-native-camera-code-reader', configScan);
  }

  /**@private Dispatches a event to open modal*/
  _openNoIdentifierModal() {
    this._dispatchEvent('modal-error-no-identifier');
  }

  /**
   * Dispatch custom event
   * @param {String} eventName
   * @param {Object} detail
   * @param {Boolean} bubbles
   * @param {Boolean} composed
   */
  _dispatchCustomEvent(eventName, detail, bubbles = true, composed = true) {
    this.dispatchEvent(new CustomEvent(eventName, { detail, bubbles, composed }));
  }

  /**
  * Dispatch camera reader error events
  * @param {Object} eventParam
  */
  cameraReaderError(eventParam) {
    const errorMessagePlugin = this.get('message', eventParam);
    if (errorMessagePlugin !== undefined) {
      if (errorMessagePlugin === 'Canceled') {
        this._dispatchCustomEvent(`${this.errorEvent}-camera-cancel`);
      } else {
        this._dispatchCustomEvent(`${this.errorEvent}-camera-reader-error`);
      }
    }
  }
  /**
   * @desc manually reading tag option
   */
  _manuallyReadingTag() {
    this.set('registerType', this.get('manualReg', this.infoTagLabels));
    this._buildReadingInput('', '', 'manual');
  }

  /**
   * @desc build object to set properties for info tag page
   * @param {String} type
   * @param {String} itemSelected
   * @param {String} valueNumber
   */
  _buildReadingInput(itemSelected = '', valueNumber = '', parametro) {
    let titleName = this.registerType === this.get('manualReg', this.infoTagLabels) ? this.infoTagLabels.manualRegister : this.infoTagLabels.scanLabel;
    let registerValidation = this.registerType === this.get('scanReg', this.infoTagLabels);

    this._dispatchInfoTag('prefix', this.get('prefix', this.infoTagLabels));
    this._dispatchInfoTag('itemselected', itemSelected);
    this._dispatchInfoTag('itemid', itemSelected);
    this._dispatchInfoTag('disabled', registerValidation ? true : false);
    let configMessageInput = {
      type: registerValidation ? '' : 'info',
      icon: registerValidation ? '' : this.get('info', this.icons),
      message: registerValidation ? '' : 'pase-register-tag-prefix-label',
      hidden: registerValidation ? true : false
    };

    this._dispatchInfoTag('label', registerValidation ? this.get('number', this.infoTagLabels) : this.get('numberDigits', this.infoTagLabels));
    this._dispatchInfoTag('disabled-number', registerValidation ? true : false);
    this._dispatchInfoTag('error-message', this.get('numberErrorMessage', this.infoTagLabels));
    this._dispatchInfoTag('error-message-icon', this.get('alert', this.icons));
    this._dispatchInfoTag('value-number', this.validationOperador === 'TELEVÍA' ? valueNumber.substring(0, 8) : valueNumber);

    this._dispatchInfoTag('value-alias', this.valueAlias);
    this._dispatchInfoTag('config-alias', { infoMessage: 'mobile-top-recarga-info-molecule-infomessage', infoMessageIcon: this.get('info', this.icons) });

    let configAliasTagError = {
      errorMessage: 'tag-register-tag-info-input-error-label',
      errorMessageIcon: this.get('alert', this.icons)
    };
    let showTitle = {
      title: `superapp-tag-${parametro}-televia-register-tag-title`,
      subtitle: `superapp-tag-${parametro}-televia-register-tag-subtitle`
    };

    this._dispatchEvent('prefix-input-validation-event', registerValidation ? true : false);
    this._dispatchEvent('prefix-item-event', itemSelected);
    this._dispatchEvent('prefix-message-input-event', configMessageInput);
    this._dispatchEvent('alias-input-error-event', configAliasTagError);
    this._dispatchEvent('show-title-event', showTitle);
    this._dispatchEvent('set-header-title-name', titleName);
    this._dispatchEvent('navigation-to-info-tag-event');
  }

  /**
   * @desc Generic dispatch event for information
   * @param {String} eventParam
   * @param {String} detail
  */
  _dispatchInfoTag(eventParam, detail) {
    this._dispatchEvent('information-tag-detail-' + eventParam, detail);
  }

  /**
   * @desc build object to set properties for info tag page
   * @param {String} itemSelected
   * @param {String} valueNumber
   */
  buildEditAlias() {
    let titleName = 'Editar Tag';

    let configInputs = {
      configPrefixInput: ' ',
      configNumberTag: ' ',
      suffixEvent: '-edit-alias',
      configAliasTag: {
        value: '',
        infoMessage: 'pase-register-tag-info-input-label',
        infoMessageIcon: this.get('info', this.icons),
        errorMessage: 'tag-register-tag-info-input-error-label',
        errorMessageIcon: this.get('alert', this.icons)
      }
    };
    let titleInfo = { // cambiar a  showTitle
      title: '',
      subtitle: 'EDITAR ALIAS'
    };
    this._dispatchEvent('title-input-info', titleInfo);
    this._dispatchEvent('reading-input-event', configInputs);
    this._dispatchEvent('set-header-title-name', titleName);
    this._dispatchEvent('navigation-to-info-tag-event');
  }

  /**
   * @desc Validate info tag information
   * @param {Object} infoTag
   */
  validationInfoTag(infoTag) {
    this._openVeil();
    this.set('infoTag', infoTag);
    this.$.apiPayments.getBills(this.get('agreement', this.infoTagLabels), 'BILL_NUMBER', this.get('prefix', this.infoTag) + this.get('numberTag', this.infoTag));
  }

  /**
   * @desc receive new alias
   * @param {Object} infoTag
   */
  changeAliasInfo(infoTag) {
    this.set('infoTag.aliasTag', infoTag.aliasTag);
    this.sendInfoTag();
  }
  /**
   * @desc Validate info tag information
   * @param {Object} infoTag
   */
  sendInfoTag(data) {
    let summaryTag = [{
      key: this.get('prefix', this.infoTagLabels),
      value: this.get('prefix', this.infoTag),
      class: this.get('inline', this.infoTagLabels)
    }, {
      key: this.get('onlyNumber', this.infoTagLabels),
      value: this.get('numberTag', this.infoTag),
      class: this.get('inline', this.infoTagLabels)
    }, {
      key: this.get('alias', this.infoTagLabels),
      value: this.get('aliasTag', this.infoTag),
      class: this.get('inline', this.infoTagLabels)
    }, {
      key: this.get('currentBalance', this.infoTagLabels),
      value: '$' + this.get('balance', this.infoTag),
      class: this.get('inline', this.infoTagLabels)
    }];

    const STEP_CHANGE_LABEL = {
      disableChange: true
    };

    this.set('informationTag', summaryTag);
    this._dispatchEvent('set-summary-tag-event', this.informationTag);
    this._dispatchEvent('set-change-label', STEP_CHANGE_LABEL);
    this._dispatchEvent('next-step');
  }

  /**
   * @desc build body to request register a new tag
   */
  _requestRegisterTag() {
    let requestBody = {
      alias: this.get('value', this.informationTag[2]),
      billNumber: this.get('prefix', this.infoTag) + this.get('numberTag', this.infoTag)
    };

    if (this.registerClicked) {
      this.$.apiPayments.storeService(this.get('agreement', this.infoTagLabels), requestBody);
      this.set('registerClicked', false);
    }
  }

  /**
   * @desc send modal error for failure response
   */
  errorRegisterTag({errorType}) {
    const errorMessageW = 'errorGeneral';
    this._dispatchEvent('error-register-pase-tag', {
      errorCode: errorType,
      errorMessage: errorMessageW,
      tipeTag: this.radioButtonSelected
    });
    this._closeVeil();
  }

  /**
   * @desc dispatch call Pase event
   */
  callPase() {
    this._dispatchEvent('request-tag-call', { value: this.get('pase', this.PHONE_NUMBERS) });
  }

  /**
   * @desc dispatch call BBVA event
   */
  callBBVA() {
    this._dispatchEvent('request-tag-call', { value: this.get('bbva', this.PHONE_NUMBERS) });
  }

  /**
   * @desc dispatch call BBVA event
   */
  callBBVALocal() {
    this._dispatchEvent('request-tag-call-local', {
      phoneNumber: this.get('bbva', this.PHONE_NUMBERS),
      numberExtension: ''
    });
  }

  /**
   * @desc success register tag response
   */
  successRegisterTag(payload) {
    let response = ((payload) || false).detail || false;
    let billResponse = response.billNumber || false;
    let idResponse = response.id || false;
    let aliasResponse = response.alias || false;

    let rechargePayload = {
      billNumber: billResponse ? billResponse : this.get('prefix', this.infoTag) + this.get('numberTag', this.infoTag),
      contractId: idResponse ? idResponse : '',
      name: aliasResponse ? aliasResponse : this.get('aliasTag', this.infoTag),
      amount: {
        amount: this.get('balance', this.infoTag) ? this.get('balance', this.infoTag) : 0,
        currency: this.get('currency', this.infoTagLabels)
      }
    };

    this._dispatchEvent('recharge-payload', rechargePayload);
    this.buildBodySuccessPage();
  }

  /**
   * @desc build object for success page
   */
  buildBodySuccessPage() {
    let configPageSuccess = {
      status: 'pocketSuccess',
      title: this.get('successRegister', this.infoTagLabels),
      destination: false,
      origin: false,
      headerSectionConfig: 'white content-header',
      bodyClass: 'pockets-footer-info',
      topInfo: [
        {
          key: this._getDateAndTime(),
          class: 'key-bold'
        },
        {
          key: this.get('operationType', this.infoTagLabels),
          value: this.get('register', this.infoTagLabels),
          class: 'header-additional-info__row spacing-top-l bold'
        },
        {
          key: 'tag-recharge-dm-success-operator',
          value: this.validationOperador,
          class: 'header-additional-info__row spacing-top bold'
        },
        {
          key: 'tag-register-success-agreement',
          value: this.get('agreement', this.infoTagLabels),
          class: 'header-additional-info__row spacing-top bold'
        },
        {
          key: 'DATOS DE TAG',
          class: 'header-additional-info__row bold spacing-top'
        },
        {
          key: this.get('key', this.informationTag[0]),
          value: this.get('value', this.informationTag[0]),
          class: 'header-additional-info__row spacing-top bold'
        },
        {
          key: this.get('numberTag', this.infoTagLabels),
          value: this.get('value', this.informationTag[1]),
          class: 'header-additional-info__row spacing-top bold'
        },
        {
          key: this.get('key', this.informationTag[2]),
          value: this.get('value', this.informationTag[2]),
          class: 'header-additional-info__row spacing-top bold'
        },
        {
          key: this.get('balance', this.infoTagLabels),
          value: this.get('value', this.informationTag[3]),
          class: 'header-additional-info__row spacing-top bold spacing'
        },
        {
          iconMessage: {
            type: 'info-dark-blue',
            icon: this.get('info', this.icons),
            message: 'tag-register-success-message',
            iconSize: {
              width: 24,
              height: 24
            }
          },
          class: 'spacing'
        }
      ],
      operations: [{
        label: this.get('share', this.infoTagLabels),
        id: 'share',
        icon: this.get('share', this.icons),
        operative: 'operation-clicked',
        class: 'buttons-tag'
      },
      {
        label: this.get('recharge', this.infoTagLabels),
        id: 'route',
        icon: this.get('dollar', this.icons),
        operative: 'operation-clicked',
        class: 'buttons-tag'
      }
      ],
      buttons: {
        primary: {
          text: 'cells-successful-response-next',
          action: 'exit-page'
        },
        secondary: {
          hidden: true
        }
      }
    };

    this._dispatchEvent('navigation-to-success-event', configPageSuccess);
    this._closeVeil();
  }

  /**@private Dispatches a event to close veil*/
  _closeVeil() {
    this._dispatchEvent('close-control-veil');
  }

  /**@private Dispatches a event to open veil*/
  _openVeil() {
    this._dispatchEvent('open-control-veil');
  }

  /**
   * @desc Dispatches 'change-collapse' event
   * */
  goOpen() {
    this._dispatchEvent('change-collapse', false);
  }

  /**
   * @desc Dispatches 'change-collapse' event  to open pdf file
   * */
  requestDocument() {
    this._openVeil();
    this.detailDownloadConfig.value = `${this.host}/business-documents/v0/business-documents`;
    this.detailDownloadConfig.title = this.t('glomo-about-terms-and-conditions-title', 'Términos y condiciones');
    this.detailDownloadConfig.body.documentTemplate.id = this.documentId;
    this._dispatchCustomEvent('request-post-document', this.detailDownloadConfig);
  }

  /**
   * @desc Dispatches 'change-collapse' event  to open pdf file
   * */
  requestDocumentLocal() {
    this._openVeil();
    let businessProperties = {
      tsec: this.tsec.token,
      deviceId: this.deviceId.value
    };
    let requestTermns = {
      documentTemplate: {
        id: this.documentId,
        templateType: {
          id: 'PDF'
        }
      }
    };

    this._dispatchEvent('set-business-properties', businessProperties);
    this._dispatchEvent('request-post-document', requestTermns);
  }

  /** * @desc request for customer-agreements */
  requestCustomerAgreements() {
    this._openVeil();
    const paseTag = this.radioButtonSelected.values.includes('register-tag-page-pase');
    let body = [ {
      termType: {
        id: paseTag ? this.termType.pase : this.termType.televia
      },
      document: {
        id: this.documentId
      },
      acceptanceMethod: {
        id: this.t('glomo-tag-card-register-dm-acceptance-method')
      },
      referenceNumber: this.get('prefix', this.infoTag) + this.get('numberTag', this.infoTag),
      acceptanceMessages: [ {
        value: paseTag ? this.t(this.acceptanceMessage.pase) : this.acceptanceMessage.televia
      } ]
    } ];
    this._dispatchEvent('set-customer-id', this.globalCacheStorage.customerId || this.globalCacheStorage.customer.customerId);
    this._dispatchEvent('post-customer-agreements', body);
  }

  /** * @param {Object} payloadResponse */
  getAgreementError(payloadResponse) {
    this.errorRegisterTag(payloadResponse);
  }

  /** * @param {Object} payloadResponse  */
  getAgreementSuccess(payloadResponse) {
    this.set('registerClicked', true);
    this._requestRegisterTag();
  }

  /**
   * @desc if the business document service to get base64 is correct and clean the information to get base64 only
   * @param documentPayload
   * */
  successPostRequestBussDoc(documentPayload) {
    let dato = documentPayload;
    var base64;
    let startBase64 = dato.indexOf('>') + 3;
    let endBase64 = dato.indexOf('=') + 2;

    if (endBase64 <= 2) {
      let foie = dato.substring(startBase64);
      endBase64 = foie.indexOf('-');
      base64 = dato.substring(startBase64, endBase64);
    } else {
      base64 = dato.substring(startBase64, endBase64);
    }
    this.set('baseSrc', base64);
    this.set('docTitle', 'TERMINOS Y CONDICIONES');
    this._closeVeil();
    this._dispatchEvent('show-document-event-local');
  }

  /**
   * @desc if the business document service to get base64 is correct and clean the information to get base64 only
   * @param documentPayload
   * */
  errorPostRequestBussDoc(payload) {
    this._closeVeil();
    this._dispatchEvent('error-filter-event', payload);
  }

  /**
   * @desc handle success response from getBills
   * */
  successBillsEmpty(payload) {
    this._closeVeil();
    this.set('infoTag.balance', '0.00');
    this.sendInfoTag();
  }

  /** @desc handle success response from getBills */
  successGetBills(payload) {
    this._closeVeil();
    let totalDebt = 0;
    let data = payload.detail[0].billAmounts;
    for (let n = 0; n < 2; n++) {
      totalDebt = data[n].amountType.id === 'TOTAL_DEBT' ? data[n].amountValue.amount : totalDebt;
    }
    this.set('infoTag.balance', this._setFormatDecimals(totalDebt));
    this.sendInfoTag();
  }

  /**
   * @desc handle error response from getBills
   * */
  errorGetBills(payload) {
    let errorCodeW = this.c(payload, 'detail.error-code', this.c(payload, 'error-code', 'EIE0331'));
    let errorMessageW = this.c(payload, 'detail.error-message', this.c(payload, 'error-message', 'errorGeneral'));
    this._dispatchEvent('error-register-pase-tag', {
      errorCode: errorCodeW,
      errorMessage: errorMessageW,
      tipeTag: this.radioButtonSelected
    });
    this._closeVeil();
  }
  /**
   * @desc open recharge tag flow or share register success img
   * */
  operationClicked(detail) {
    let eventName;
    let params;
    if (detail.id === 'share') {
      eventName = 'operation-clicked-' + detail.id;
      params = {
        height: this.totalHeight,
        share: true
      };
    } else {
      params = { contactId: this.c(this.rechargePagePayload, 'contractId') };
      Object.assign(params, this.rechargePagePayload);
      eventName = 'navigation-to-up-tag-pase';
    }
    if (eventName === 'navigation-to-up-tag-pase') {
      this._dispatchEvent(eventName, params);
      this._dispatchEvent('navigate-to-tag-recharge', {
        page: 'tagRecharge'
      });
    } else {
      this._dispatchEvent(eventName, params);
    }
  }

  /**
  * send navigation
  * @param {Object} - response payload
  */
  navigatePage() {
    this._dispatchEvent('go-to-tag-card-list', {
      page: 'tagCardList'
    });
  }

  /**
  * validate error connection
  * @param {Object} - response payload
  */
  validateConnection(responsePayload) {
    if (responsePayload === 600) {
      this._dispatchEvent('no-connection-event');
    }
  }
  /**
    * validate amount tags
    * @param {Object} - response payload
  */
  validateAmountTags(radioButtonSelected) {
    let provider = '';
    this.radioButtonSelected = radioButtonSelected;
    if (this.radioButtonSelected.index) {
      this.validationAgreement = this.agreement.televia;
      provider = 'televia';
    } else {
      this.validationAgreement = this.agreement.pase;
      provider = 'pase';
    }

    const STEP_CHANGE_LABEL_DISABLE = {
      disableChange: false
    };

    this._dispatchEvent('step-change-label-disable', STEP_CHANGE_LABEL_DISABLE);
    this._dispatchEvent('send-data-provider', provider);
    this._dispatchEvent('show-second-step');
    this.$.apiPayments.getStoredServices();
  }
  /**
    * error service list
    * @param {Object} - response payload
  */
  getServiceList(servicesList) {
    let amountTags = 0;
    if (Array.isArray(servicesList.detail)) {
      for (let tag of servicesList.detail) {
        if (tag.service.id === this.validationAgreement) {
          amountTags++;
        }
      }
    }
    if (amountTags >= this.amountValueTag) {
      this._dispatchEvent('error-register-pase-tag', {
        errorCode: 'EIE0331',
        errorMessage: 'tag-limit-max',
        tipeTag: this.radioButtonSelected
      });
    } else {
      this.dispatchEvent(new CustomEvent('next-step'));
      this.dispatchEvent(new CustomEvent('amount-tags-success', {
        bubbles: true,
        composed: true,
        detail: this.radioButtonSelected
      }));
    }
  }
  /**
   * @desc handle error response from setService
  * */
  responseErrorListService(payload) {
    let errorCode = payload.detail['error-code'];
    let errorMessage = payload.detail['error-message'];
    this._dispatchEvent('error-register-pase-tag', {
      errorCode: errorCode,
      errorMessage: errorMessage,
      tipeTag: this.radioButtonSelected
    });
    this._closeVeil();
  }
  /**
   * @desc sset format decimals
   * */
  _setFormatDecimals(decimal = 0) {
    let decimalLength = decimal.toString().indexOf('.');
    let newDecimal;
    let numStr = decimal.toString().split('.');
    let integer = Number(numStr[0]);
    if (decimalLength < 0) {
      newDecimal = '00';
    } else {
      newDecimal = numStr[1].substr(0, 2);
      if (newDecimal.toString().length === 1) {
        newDecimal = newDecimal + '0';
      }
    }
    return integer + '.' + newDecimal;
  }
  /**
   * Validate radio button selected
   */

  validateRadioButton(valueButton) {
    let inputNumberMax = 0;
    if (valueButton.index === 0) {
      this.documentId = 'GMDTCPT001';
      this.validationAgreement = this.infoTagLabels.agreement = '001783556';
      this.validationOperador = this.infoTagLabels.operador = 'PASE';
      inputNumberMax = 9;
    } else if (valueButton.index === 1) {
      this.documentId = 'GMDTCTV001';
      this.validationAgreement = this.infoTagLabels.agreement = '002036657';
      this.validationOperador = this.infoTagLabels.operador = 'TELEVÍA';
      inputNumberMax = 8;
    }
    this._dispatchEvent('validation-agreement', this.validationAgreement);
    this._dispatchEvent('validation-operador', this.validationOperador);
    this._dispatchEvent('validation-input-max', inputNumberMax);
  }
  /**
  *Funtion to send payload to share receipt
  *
  * @return {void}
  */
  shareReceipt() {
    const receiptData = {
      date: new Date(),
      numberReference: this.get('agreement', this.infoTagLabels),
      operationType: this.get('register', this.infoTagLabels),
      concept: this.get('successRegister', this.infoTagLabels),
      templateSelected: 'codicelExternalTransfer'
    };
    this._dispatchEvent('share-refund-receipt', receiptData);
  }

  /**
   * Open native settings
   * @event open-native-settings
   */
  openNativeSettings() {
    this._dispatchEvent('open-native-settings', { setting: 'settings' });
  }

  /**
   * @description Displays operations according to flags
   * @param {object} featureFlags
   * @event show-radio-button-list
   */

  featureFlagCollection(featureFlags) {
    const radioButtonList = [];
    const servicePaymentTagPase = featureFlags[this.featureFlagTag.pase]?.value || false;
    const servicePaymentTagTelevia = featureFlags[this.featureFlagTag.televia]?.value || false;

    if (servicePaymentTagPase) {
      radioButtonList.push(this._createRadioButtonConfig('1', 'pase', 'icon-src-image-one'));
    }

    if (servicePaymentTagTelevia) {
      radioButtonList.push(this._createRadioButtonConfig('2', 'televia', 'icon-src-image-two'));
    }

    this._dispatchEvent('show-radio-button-list', radioButtonList);
  }

  /**
   * @desc object structure for radio buttons
   * */
  _createRadioButtonConfig(id, nameProp, className) {
    return {
      externalLink: false,
      config: {
        id,
        radio: `register-tag-page-${nameProp}`,
        collapsed: {
          key: `register-tag-page-${nameProp}`,
          value: `register-tag-page-${nameProp}-agreement`
        },
        image: `images/tagCard/${nameProp}.svg`,
        class: className,
        disabled: false
      }
    };
  }

  /**
   * @description parse date anf join with current time
   * @returns date joied with time
   */
  _getDateAndTime(receivedDate) {
    const date = new Date();
    const minutes = ('0' + date.getMinutes()).slice(-2);
    const seconds = ('0' + date.getSeconds()).slice(-2);
    return `${moment(receivedDate).format('LL')}, ${date.getHours()}:${minutes}:${seconds}h`;
  }
  /**
   * @private Dispatches a custom event with name and detail
   * @param {String} nameParam
   * @param {any} detail
   */
  _dispatchEvent(nameParam, detail = true) {
    this.dispatchEvent(new CustomEvent(nameParam, {
      bubbles: true,
      composed: true,
      detail: detail
    }));
  }

}

customElements.define(GlomoTagCardRegisterDmMx.is, GlomoTagCardRegisterDmMx);