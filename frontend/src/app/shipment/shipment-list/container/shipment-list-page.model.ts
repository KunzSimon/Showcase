export class ShipmentListModel {
    public shipmentList: ShipmentListRowModel[];
}

export class ShipmentListRowModel {
    public trackingId: string;
    public senderAddress: string;
    public receiverAddress: string;
    public status: string;

    constructor(trackingId: string, senderAddress: string, receiverAddress: string, status: string) {
        this.trackingId = trackingId;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.status = status;
    }
}
